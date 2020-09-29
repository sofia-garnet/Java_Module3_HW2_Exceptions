package com.company.module;
import com.company.exceptions.*;

public class Client {

    public static int Fib(int n) throws CheckedException {
        if (n < 0) {
            throw new CheckedException();
        }
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new UncheckedException();
        }
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }


    public static void ExecuteMethods() {
        try {
            int fibonacci = Fib(-14444);
        } catch (CheckedException e) {
            e.printStackTrace();
        }

        try {
            int factorial = factorial(-14444);
        } catch (UncheckedException e) {
            e.printStackTrace();
        }

    }
}

