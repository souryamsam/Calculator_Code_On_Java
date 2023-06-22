import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int First_Number, Second_Number, Operator, Result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        First_Number = input.nextInt();
        System.out.println("Enter the second number: ");
        Second_Number = input.nextInt();
        System.out.println("\n 1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION \n 5.REMAINDER");
        System.out.println("Choose the operator: ");
        Operator = input.nextInt();
        switch (Operator) {
            case 1:
                Result = First_Number + Second_Number;
                System.out.println(First_Number + " + " + Second_Number + " = " + Result);
                break;
            case 2:
                Result = First_Number - Second_Number;
                System.out.println(First_Number + " - " + Second_Number + " = " + Result);
                break;
            case 3:
                Result = First_Number * Second_Number;
                System.out.println(First_Number + " * " + Second_Number + " = " + Result);
                break;
            case 4:
                Result = First_Number / Second_Number;
                System.out.println(First_Number + " / " + Second_Number + " = " + Result);
                break;
            case 5:
                Result = First_Number % Second_Number;
                System.out.println(First_Number + " % " + Second_Number + " = " + Result);
                break;
            default:
                System.out.println("Enter the valid operator");
        }

    }
}
