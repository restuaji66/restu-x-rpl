import java.util.Scanner;

public class inputttt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jenis kelamin (L/P): ");
        char jeniskelamin = input.nextLine().toLowerCase().charAt(0);

        System.out.println("Masukkan nomer sepatu: ");
        int noSepatu = input.nextInt();

        input.nextLine(); 

        System.out.println("Apakah sudah menikah? (true/false): ");
        boolean sudahMenikah = input.nextBoolean();

        System.out.println("\nBiodata Anda");
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Nomor Sepatu: " + noSepatu);
        System.out.println("Sudah Menikah: " + sudahMenikah);

        input.close();
    }
    
}
