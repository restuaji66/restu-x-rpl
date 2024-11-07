public class OperatorPerbandingan7 {
    public static void main(String[] args) {
        boolean hasilperbandingan;
        int a = 10;
        int B = 15;

        System.out.println("nilai a = " + a + "\nNilai b = " );

        // membandingkan apakah a sama dengan b?
        hasilperbandingan = a == B;
        System.out.println("A == B ? " + hasilperbandingan);

        // membandingkan apakah a tidak sama dengan b?
        hasilperbandingan = a != B;
        System.out.println("a != b ? " + hasilperbandingan);

        // membandingkan apakah a lebih besar dari b?
        hasilperbandingan = a > B;
        System.out.println("a > b ? " + hasilperbandingan);

        // membandingkan apakah a lebih kecil dari b?
        hasilperbandingan = a < B;
        System.out.println("a < b ?" + hasilperbandingan);

        // membandingkan apakah a lebih besar sama dengan b?
        hasilperbandingan = a >= B;
        System.out.println("a >= b ? " + hasilperbandingan);

        // membandingkan apakah a lebih kecil samaa dengan b?
        hasilperbandingan = a <= B;
        System.out.println("a <= b " + hasilperbandingan);

    }
}