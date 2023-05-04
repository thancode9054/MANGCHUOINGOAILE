import java.util.Scanner;

public class bai4 {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpace = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch)) {
                countUpper++;
            } else if (Character.isLowerCase(ch)) {
                countLower++;
            } else if (Character.isDigit(ch)) {
                countDigit++;
            } else if (Character.isWhitespace(ch)) {
                countSpace++;
            }
        }

        System.out.println("so chu hoa trong chuoi: " + countUpper);
        System.out.println("so chu thuong trong chuoi: " + countLower);
        System.out.println("so chu so trong chuoi: " + countDigit);
        System.out.println("So khoang trang trong chuoi: " + countSpace);
    }
}
