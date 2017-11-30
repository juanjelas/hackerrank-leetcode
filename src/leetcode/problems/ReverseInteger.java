package leetcode.problems;

public class ReverseInteger {

    public static void main(String[] args){
        ReverseInteger ri = new ReverseInteger();
        int result = ri.reverse(123);
        System.out.println(result == 321);
        int result1 = ri.reverse(-123);
        System.out.println(result1 == -321);
        int result2 = ri.reverse(120);
        System.out.println(result2 == 21);
    }

    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        return rev;
    }

    public int reverse2(int x) {
        StringBuilder rev = new StringBuilder(String.valueOf(x));
        String result;
        if (x < 0) {
            result = "-" + rev.delete( 0, 1).reverse().toString();
        } else {
            result = rev.reverse().toString();
        }
        int resultado = 0;
        try {
            resultado = Integer.valueOf(result);
        } catch (NumberFormatException e){
        }
        return resultado;
    }
}
