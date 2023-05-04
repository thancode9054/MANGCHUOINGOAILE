import java.util.Scanner;

public class bai1 {
    private static Scanner input;

    public static int nhap() {
        input = new Scanner(System.in);
        boolean check = false;
        int nhapPhanTu = 0;
        while (!check) {
            try {
                nhapPhanTu = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("ban hay nhap lai bang so ");
                input.nextLine();
            }

        }
        return nhapPhanTu;
    }

    public static void nhapMangVaDoKq() {
        int arr[];
        int n;
        int x;
        System.out.println("nhap so phan tu cua day so:: ");
        n = nhap();
        arr = new int[n];
        System.out.println("nhap cac phan tu cua day so: ");
        for (int i = 0; i < n; i++) {
            arr[i] = nhap();
        }
        System.out.println("nhap phan tu x ");
        x = nhap();
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == x) {
                System.out.println("co hai phan tu thu " + i + " va thu " + (i + 1) + " co tong bang x = " + x);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("khong co phan tu nao lien ke co tong bang x = " + x);
        }
    }

    public static void main(String[] args) {
        nhapMangVaDoKq();
    }
}
