import java.util.Scanner;

public class bai6 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String choice;
        do {
            int secretNumber = (int) (Math.random() * 101); // phát sinh số ngẫu nhiên trong đoạn [0..100]
            int guess;
            int numGuesses = 0;

            while (numGuesses < 7) {
                System.out.print("nhap so doan cua ban: ");
                guess = scanner.nextInt();
                numGuesses++;

                if (guess == secretNumber) {
                    System.out.println("chuc mung ban da doan trung " + numGuesses + " lan doan.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("So ban doan nho hon ngau nhien da cho.");
                } else {
                    System.out.println("so ban doan lon hon ngau da cho.");
                }
            }

            if (numGuesses == 7) {
                System.out.println("Ban da het so lan doan : ");
            }

            System.out.print("ban co muon choi lai khong vui long chon yes/no: ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
