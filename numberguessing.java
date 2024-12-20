import java.util.Scanner;

public class numberguessing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 42;
        int player;
        System.out.println("welcome to number guessing game");
        System.out.println("enter the number to guess");
        player = s.nextInt();

        if (player < num) {
            System.out.println("very much loo !");
        } else if (player > num) {
            System.out.println("very much high !");
        } else {
            System.out.println("Congradulation you can done it !");
        }

    }
}
