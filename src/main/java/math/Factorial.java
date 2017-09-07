package math;

public class Factorial {


    public static int silnia(int i) {
        if (i <= 1 ) {
            return 1;
        } else {
            return i * silnia(i - 1);
        }
    }
}

