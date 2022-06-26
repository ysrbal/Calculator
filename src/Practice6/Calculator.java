package Practice6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Enter first number : ");
        n1 = input.nextInt();
        System.out.print("Enter second number : ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Dividing");
        System.out.print("Your choose : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                select = (n1+n2);
                System.out.print("Answer : " + select);
                break;
            case 2:
                select = (n1-n2);
                System.out.print("Answer : " + select);
                break;
            case 3:
                select = (n1*n2);
                System.out.print("Answer : " + select);
                break;
            case 4:
                if (n2 != 0){
                    select = (n1/n2);
                    System.out.print("Answer : " + select);
                }
                else {
                    System.out.print("A number cannot be divided by 0.");
                }
                break;
            default:
                System.out.println("You have entered incorrectly. TRY AGAIN !");
        }

    }
}

