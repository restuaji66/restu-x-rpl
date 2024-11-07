import java.util.Scanner;

public class tugas16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai dari pegguna
        System.out.println("Masukkan nilai siswa: ");
        int nilai = scanner.nextInt();

        // Menggunakan operator ternary untuk menentukan kenaikan kelas
        String hasil = (nilai >= 75) ?
        "Naik Kelas" : "Tidak Naik Kelas";

        // Menampilkan hasil 
        System.out.println("hasil: " + hasil);

        // menutup scanner
        scanner.close();
    }
}