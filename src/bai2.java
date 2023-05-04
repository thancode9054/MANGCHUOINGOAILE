import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    private static Scanner input;

    public static void xuatMang(int arr[]) {
        System.out.println("Arrays " + Arrays.toString(arr));
    }

    public static int max(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr, int n) {
        int min = max(arr, n);
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int soChan(int arr[], int n) {
        int soDem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                soDem++;
            }
        }
        return soDem;
    }

    public static void Prime(int arr[], int n) {
        boolean check;

        for (int i = 0; i < n; i++) {
            check = true;
            if (arr[i] <= 1) {
                check = false;
            }

            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println(arr[i] + " is prime");
            }

        }

    }

    public static void mangTangDan(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        System.out.println("Arrays increase " + Arrays.toString(arr));
    }

    public static int find(int[] arr, int n) {
        int viTri = 0;
        System.out.println("nhap phan tu ban muon tim ");
        int findNumber = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == findNumber) {
                viTri = i;
            }
        }
        return viTri;
    }

    public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.println("nhap so phan tu vao:  ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap cac phan tu vao mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        xuatMang(arr);
        System.out.println("Max is : " + max(arr, n));
        System.out.println("Min is : " + min(arr, n));
        System.out.println("there are " + soChan(arr, n) + " even");
        Prime(arr, n);
        mangTangDan(arr, n);
        System.out.println(" phan tu ma ban tim o vi tri thu " + find(arr, n) + " cua mang ");
    }

}
