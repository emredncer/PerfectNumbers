import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        int number;
        boolean errorCheck = true;

        while (errorCheck) { //istediğim şekilde bir girdi yapılmadığı sürece dönecek.
            // program bitsin istemiyorum

            System.out.print("Enter the number: ");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if (number <= 1) {
                System.out.println("Please enter a positive integer (greater than 1)!");
            } else {
                int tempNumber = 0;
                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        tempNumber += i;
                    }
                }

                if (tempNumber == number) {
                    System.out.println(number + " is a perfect number!");
                    errorCheck = false;
                } else {
                    System.out.println(number + " is not a perfect number!");
                    errorCheck = false;
                }
            }
        }
    }
}
