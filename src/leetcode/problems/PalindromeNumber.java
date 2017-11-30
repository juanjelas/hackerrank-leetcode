package leetcode.problems;

public class PalindromeNumber {

    public static void main(String[] args){
        PalindromeNumber pali = new PalindromeNumber();
        System.out.println(pali.isPalindrome(444));
        System.out.println(pali.isPalindrome(323));
        System.out.println(pali.isPalindrome(321123));
        System.out.println(pali.isPalindrome(4652525));
    }

    public boolean isPalindrome2(int x) {
        if (x < 0){
            return false;
        }
        String number = String.valueOf(x);
        String reverse = new StringBuilder(number).reverse().toString();
        return reverse.equals(number);
    }

    public boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
