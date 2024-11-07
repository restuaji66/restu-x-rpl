
    import java.util.Scanner;

public class percabangan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        String namaHari;

        switch (angka) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "senin";
            case 3:
                namaHari = "selasa";
            case 4:
                namaHari = "Rabu";
            case 5:
                namaHari = "Kamis";
            case 6:
                namaHari = "Jum'at";

                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Angka tidak valid. Harap masukkan angka antara 1 hingga 7.";
                break;
        }

        System.out.println("Hari: " + namaHari);
    }
    
}


