import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n=0;
        ArrayList<Double> array = new ArrayList<>();

        // Đọc mảng
        System.out.print("Nhap so luong phan tu: ");
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        if (n <= 0) {
            return;
        }
        for (int i=0; i<n; i++) {
            try {
                array.add(scanner.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Input error!");
                break;
            }
        }

        double max = array.get(0), ratmax = array.get(0);
        for (double x: array) {
            if (x > ratmax) {
                max = ratmax;
                ratmax = x;
                continue;
            }
            if (x < max) {
                ratmax = max;
                max = x;
            }
        }

        if (Objects.equals(max, ratmax)) {
            System.out.println("Khong co so lon thu 2.");
        } else {
            System.out.println("So lon thu 2 la " + max);
        }

        scanner.close();
        return;
    }

}