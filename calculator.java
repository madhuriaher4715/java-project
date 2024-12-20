import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch;
        System.out.println("enter the first number");
        int num1 = s.nextInt();
        System.out.println("enter the second number");
        int num2 = s.nextInt();
        System.out.println("select one chosie 1.addition 2.substaction 3.multiplication 4.division");
        System.out.println("enter prper choise (1-4)");
        int n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("addition of two number" + (num1 + num2));
                break;
            case 2:
                System.out.println("subtraction of two number" + (num1 - num2));
                break;
            case 3:
                System.out.println("division of two number" + (num1 * num2));
                break;
            case 4:
                System.out.println("multiplication of two number" + (num1 / num2));
                break;

            default:
                System.out.println("enter the valid choise");
                break;
        }
    }
}