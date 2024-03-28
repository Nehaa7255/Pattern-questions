import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = n; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

