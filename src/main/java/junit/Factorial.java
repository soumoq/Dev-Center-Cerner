package junit;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(new Factorial().fact(11));
    }

    public int fact(int n) {
        int res = 1;
        if (n == 0)
            return res;

        if (n < 0)
            throw new NumberFormatException("Negative number factorial is not possible.");

        if (n > 10)
            throw new NumberFormatException("Number is too large.");

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
    }
}
