import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java");
        System.out.println("A) Operatoe Indosat");
        System.out.println("B) Operator Sritmatika");
        System.out.println("C) Operator Telkomsel");
        System.out.println("d) Operator Assignment");

        System.out.println("Masukkan Jawaban Anda (A, B, C, atau D): ");
        String Answer = scanner.next();

        String jawaban1 = "B";
        String Jawaban2 = "D";

        if (Answer.equals(jawaban1) || Answer.equals(Jawaban2)) {
            System.out.println("Benar! anda menjawab salah satu dari pilihan jawaban yang benar.");
        } else {
            System.out.println("Salah. jawaban yang benar adalah operator Aritmatika atau operator Assognment.");
        }
    }
}