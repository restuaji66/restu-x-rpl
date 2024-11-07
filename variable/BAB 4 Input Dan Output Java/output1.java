import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inputkan namalengkap: ");
        String nama = input.nextLine();

        System.out.println("inputkan usia: ");
        int angka = input.nextInt();

        System.out.println("inputkan asal kota: ");
        String kotaAsal = input.nextLine();

        System.out.println("inputkan tinggi badan: ");
        double tinggiBadan = input.nextDouble();

        System.out.println("\n======= Output =======");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + angka);
        System.out.println("Kota asal: " + kotaAsal);
        System.out.println("Tinggi badan: " + tinggiBadan);
    }
}
