import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputQuantity = 0;
        ArrayList<Double> inputList = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        Scanner scanner = new Scanner(System.in);
        try {
            inputQuantity = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            return;
        }

        if (inputQuantity < 2) {
            System.out.println("Phai co it nhat 2 phan tu.");
            return;
        }
        for (int i = 0; i < inputQuantity; i++) {
            try {
                inputList.add(scanner.nextDouble());
            } catch (InputMismatchException e) {
                System.out.println("Input error!");
                return;
            }
        }

        double stLargest;
        double ndLargest;
        if (inputList.get(0) > inputList.get(1)) {
            stLargest = inputList.get(0);
            ndLargest = inputList.get(1);
        } else {
            stLargest = inputList.get(1);
            ndLargest = inputList.get(0);
        }

        for (double x : inputList) {
            if (x > stLargest) {
                ndLargest = stLargest;
                stLargest = x;
            } else if (x != stLargest && x > ndLargest) {
                ndLargest = x;
            }
        }

        if (Objects.equals(stLargest, ndLargest)) {
            System.out.println("Khong co so lon thu 2.");
        } else {
            System.out.println("So lon thu 2 la " + ndLargest);
        }

        scanner.close();
    }

}