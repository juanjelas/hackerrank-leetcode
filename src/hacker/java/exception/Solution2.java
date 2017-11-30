package hacker.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
