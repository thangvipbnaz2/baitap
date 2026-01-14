import java.util.Scanner;

public class bai1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Xin chào Java!");
        System.out.println("Tôi đang học lập trình Java.");

        bai2();
        bai3();
        bai4();
        bai5();
        bai6();
        bai7();
        bai8();
        bai9();
        bai10();
        bai11();
        bai12();
        bai13();
        bai14();
        bai15();
        sc.close();
    }

    public static void bai2() {
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int so2 = sc.nextInt();

        int sum = so1 + so2;
        System.out.println("Tổng của " + so1 + " và " + so2 + " là: " + sum);
    }

    public static void bai3() {
        System.out.print("Nhập một số để kiểm tra chẵn lẻ: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn");
        } else {
            System.out.println("Số " + number + " là số lẻ");
        }
    }

    public static void bai4() {
        System.out.print("Nhập chiều dài: ");
        int chieuDai = sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int chieuRong = sc.nextInt();

        int chuVi = 2 * (chieuDai + chieuRong);
        int dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi HCN: " + chuVi);
        System.out.println("Diện tích HCN: " + dienTich);
    }

    public static void bai5() {
        System.out.print("Nhập số thứ nhất: ");
        int so1 = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int so2 = sc.nextInt();

        if (so1 > so2) {
            System.out.println(so1 + " > " + so2);
        } else if (so1 == so2) {
            System.out.println(so1 + " = " + so2);
        } else {
            System.out.println(so1 + " < " + so2);
        }
    }

    public static void bai6() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void bai7() {
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tổng từ 1 đến " + n + " là: " + tong);
    }

    public static void bai8() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
    static void bai9() {
        System.out.print("Nhập số nguyên dương: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Số chữ số = " + count);
    }

    static void bai10() {
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println(n + " là số nguyên tố");
        else
            System.out.println(n + " không phải số nguyên tố");
    }

    static void bai11() {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Tổng mảng = " + sum);
    }

    static void bai12() {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    static void bai13() {
        sc.nextLine(); // bỏ dòng thừa
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        String dao = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            dao += s.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược: " + dao);
    }

    static void bai14() {
        System.out.println("Các số nguyên tố từ 1 đến 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void bai15() {
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        String maxName = "";
        double maxScore = -1;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Tên SV " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Điểm: ");
            double score = sc.nextDouble();
            sc.nextLine();

            sum += score;
            if (score > maxScore) {
                maxScore = score;
                maxName = name;
            }

            System.out.print("Xếp loại: ");
            if (score >= 8) System.out.println("Giỏi");
            else if (score >= 6.5) System.out.println("Khá");
            else if (score >= 5) System.out.println("Trung bình");
            else System.out.println("Yếu");
        }

        System.out.println("Điểm trung bình = " + (sum / n));
        System.out.println("Sinh viên điểm cao nhất: " + maxName + " (" + maxScore + ")");
    }
}
