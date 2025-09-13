import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int operator, n1, n2;
        System.out.println("1-ADDITION \n2-SUBTRACTION \n3-MULTIPLICATION \n4-DIVISION");
        System.out.print("Choose Operator: ");
        
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

        System.out.print("Enter First Number: ");
        n1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        n2 = sc.nextInt();

        int result = 0;
        boolean valid = true;

        switch(operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Operator Selected!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result is: " + result);
        }

        sc.close();
    }
}

