import com.mongodb.MongoCredential;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.MongoException;
import com.mongodb.MongoSecurityException; // Eksepsi spesifik untuk masalah autentikasi
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.Collections;

public class DbConnection {

    // --- INFORMASI KONEKSI YANG HARUS KAMU GANTI ---
    // Pastikan ini sesuai dengan pengguna yang kamu buat di MongoDB
    private static final String CORRECT_HOST = "localhost";
    private static final int CORRECT_PORT = 27017;
    private static final String CORRECT_USERNAME = "appUser";       // GANTI dengan username yang kamu buat!
    private static final String CORRECT_PASSWORD = "appPassword";   // GANTI dengan password yang kamu buat!
    private static final String CORRECT_AUTH_DB = "appdb";          // GANTI dengan database tempat pengguna ini dibuat
    private static final String CORRECT_TARGET_DB = "appdb";        // Database yang ingin diakses (bisa sama dengan authDb)

    // --- INFORMASI KONEKSI YANG SALAH (Untuk Menguji Eksepsi) ---
    private static final String WRONG_USERNAME = "badUser";
    private static final String WRONG_PASSWORD = "badPassword";
    // Kamu bisa mencoba salahAuthDb untuk skenario berbeda
    // private static final String WRONG_AUTH_DB = "nonExistentAuthDb";


    public static void main(String[] args) {
        System.out.println("--- UJI KONEKSI SALAH (Username/Password Invalid) ---");
        testMongoConnection(
                CORRECT_HOST,
                CORRECT_PORT,
                WRONG_USERNAME,      // Menggunakan username yang salah
                WRONG_PASSWORD,      // Menggunakan password yang salah
                CORRECT_AUTH_DB,
                CORRECT_TARGET_DB
        );

        System.out.println("\n----------------------------------------------------\n");

        System.out.println("--- UJI KONEKSI BENAR ---");
        testMongoConnection(
                CORRECT_HOST,
                CORRECT_PORT,
                CORRECT_USERNAME,    // Menggunakan username yang benar
                CORRECT_PASSWORD,    // Menggunakan password yang benar
                CORRECT_AUTH_DB,
                CORRECT_TARGET_DB
        );
    }

    private static void testMongoConnection(String host, int port, String username, String password, String authDb, String targetDb) {
        MongoClient mongoClient = null;
        try {
            System.out.println("Mencoba menghubungkan ke MongoDB sebagai user: '" + username + "' di DB autentikasi: '" + authDb + "'...");

            // 1. Buat Kredensial MongoDB
            MongoCredential credential = MongoCredential.createCredential(
                    username,
                    authDb,
                    password.toCharArray() // Password harus dalam bentuk char array
            );

            // 2. Konfigurasi MongoClientSettings dengan kredensial dan alamat server
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyToClusterSettings(builder ->
                            builder.hosts(Collections.singletonList(new ServerAddress(host, port))))
                    .credential(credential)
                    .build();

            // 3. Buat Instance MongoClient
            // Pada tahap ini, koneksi fisik belum terjadi.
            mongoClient = MongoClients.create(settings);

            // 4. Lakukan Operasi yang Membutuhkan Koneksi Fisik dan Autentikasi
            // Operasi ini (seperti mendapatkan database, atau mencantumkan nama koleksi)
            // akan memicu proses koneksi dan autentikasi.
            MongoDatabase database = mongoClient.getDatabase(targetDb);
            database.listCollectionNames().first(); // Ini akan memaksa autentikasi

            System.out.println("Status: Berhasil! Terhubung ke MongoDB dan terautentikasi sebagai '" + username + "'.");
            System.out.println("Akses database: " + database.getName());

        } catch (MongoSecurityException e) {
            // Ini akan tertangkap jika username/password salah, atau user tidak punya hak di authDb
            System.err.println("Status: GAGAL! Kesalahan Autentikasi MongoDB.");
            System.err.println("Pesan Error: " + e.getMessage());
            System.err.println("Sebab: Username atau password salah, atau pengguna tidak memiliki izin yang cukup di database autentikasi.");
            // e.printStackTrace(); // Uncomment ini untuk melihat stack trace lengkap (untuk debugging)

        } catch (MongoException e) {
            // Ini akan tertangkap jika ada masalah koneksi umum lainnya (server tidak jalan, port salah, dll.)
            System.err.println("Status: GAGAL! Kesalahan Koneksi MongoDB Umum.");
            System.err.println("Pesan Error: " + e.getMessage());
            System.err.println("Sebab: Pastikan server MongoDB berjalan di '" + host + ":" + port + "'.");
            // e.printStackTrace(); // Uncomment ini untuk melihat stack trace lengkap

        } finally {
            // Pastikan MongoClient ditutup untuk membebaskan sumber daya
            if (mongoClient != null) {
                mongoClient.close();
                System.out.println("Koneksi MongoDB ditutup.");
            }
        }
    }
}