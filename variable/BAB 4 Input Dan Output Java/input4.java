import java.util.Scanner;

public class inputt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.println("Masukkan nomer induk siswa; ");
        String nomerIndukSiswa = input.nextLine();

        System.out.println("Masukkan umur: ");
        int umur = input.nextInt();
        
        System.out.println("\nBiodata Anda:");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Nomor Induk Siswa: " + nomerIndukSiswa);
        System.out.println("Umur: " + umur + "tahun");

        input.close();
    }
}
