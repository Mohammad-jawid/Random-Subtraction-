package randomsubtraction;

import java.util.Scanner;

public class RandomSubtraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        System.out.println("The result of " + num1 + "-" + num2 + "=?");
        System.out.println("Please Enter your answer.");

        double answer = input.nextDouble();
        double result = num1 - num2;

        if (answer == result) {
            System.out.println("your answer is Correct");
        } else {
            System.out.println("your answer is Wrong");
        }

    }

}
