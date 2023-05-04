import java.util.Scanner;



public class bai3 {
    private static Scanner input;

    public static void nhapMang(int sc, int sd, int a[][]) {
        System.out.println("nhap cac phan tu vao mang: ");
        for (int i = 0; i < sd; i++) {

            for (int j = 0; j < sc; j++) {
                System.out.printf("Nhap vao gia tri tai vi tri a[%d][%d]: ", i, j);
                a[i][j] = input.nextInt();
            }

        }
    }

    public static void hienThi(int sd, int sc, int a[][]) {

        for (int i = 0; i < sd; i++) {
            for (int j = 0; j < sc; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int phanTuNhoNhat(int a[][], int sc, int sd) {
        int min = a[0][0];
        for (int i = 0; i < sc; i++) {
            for (int j = 0; j < sd; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        return min;
    }

    public static int phanTuLeLonNhat(int a[][], int sd, int sc) {
        int max = a[0][0];
        for (int i = 0; i < sd; i++) {
            for (int j = 0; j < sc; j++) {
                if (a[i][j] % 2 != 0) {
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static void dongCoTongLonNhat(int a[][], int sd, int sc) {
        int max = 0;

        int viTri = -1;
        for (int i = 0; i < sd; i++) {
            int sum = 0;
            for (int j = 0; j < sc; j++) {
                sum += a[i][j];

            }
            if (sum > max) {
                max = sum;
                viTri = i;
            }
        }
        System.out.println("tong phan tu cua dong lon nhat la " + max);
        System.out.println("dong lon nhat la dong thu " + (viTri + 1));
    }
    public static void main(String[] args) {
        System.out.println("------- TAO MA TRAN---------");
        input = new Scanner(System.in);
        System.out.println("nhap sd cua ma tran vao: ");
        int sd = input.nextInt();
        System.out.println("nhap sc cua ma tran vao: ");
        int sc = input.nextInt();
        int a[][] = new int[sd][sc];
        nhapMang(sc, sd, a);
        hienThi(sd, sc, a);
        System.out.println("phan tu nho nhat trong ma tran la: " + phanTuNhoNhat(a, sc, sd));
        System.out.println("phan tu le lon nhat trong ma tran la: " + phanTuLeLonNhat(a, sd, sc));
        dongCoTongLonNhat(a, sd, sc);
        
    }

}
