import javax.swing.JOptionPane;

public class tugasoperator5 {
    public static void main(String[] args) {
        int sirup = 5;
        int deterjen = 6;
        int mieintan = 10;

        System.out.println("Jumlah Barang Awal:");
        System.out.println("Sirup: " + " Botol");
        System.out.println("Deterjen: " + deterjen + " bungkkus");
        System.out.println("Mie Intstan: " + mieintan + " bungkus");

        int tambahSirup = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah sirup yang ditambahkan"));
        int tambahDeterjen = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah deterjen yang ditambahkan"));
        int tambahMieIntan = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah mie intan yang ditambahkan"));

        sirup += tambahSirup;
        deterjen += tambahDeterjen;
        mieintan += tambahMieIntan;

        System.out.println("\njumlah Barang Setelah Ditambahkan:");
        System.out.println("Sirup: " + sirup + "botol");
        System.out.println("Deterjen: " + deterjen + "bungkus");
        System.out.println("Mie Instan: " + mieintan + "bungkus");
    }
}