import java.util.Scanner;

public class bai5 {
    private static Scanner input;
    public static void main(String[] args) {
         input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + ch + " trong chuỗi " + input + " là: " + count);
    }
}
