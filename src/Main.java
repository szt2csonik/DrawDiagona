import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the Square size: ");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
        System.out.println("");
        int round=0;
        for (int i = 0; i < size-2; i++) {
            round++;
            for (int j = 0; j < size; j++) {
                if (j == 0 || j==size-1 || j==round) {
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
    }
}