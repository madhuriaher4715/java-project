import java.util.Scanner;

public class stonegame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Stone Paper siccor game");
        System.out.println("enter your choise 1.stone 2.paper 3.scissor");
        int uchoise = s.nextInt();
        int cchoise = s.nextInt();
        if (uchoise == 0) {
            System.out.println("exiting");
        } else if ((uchoise == 1 && cchoise == 3 || (uchoise == 2 && cchoise == 1) || (uchoise == 3 && cchoise == 2))) {
            System.err.println("You are winner !....");
        } else {
            System.out.println("computer is winner !....");
        }
    }

}
