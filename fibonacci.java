package kalkulator;

public class fibonacci {

    public static int fib(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n;
        n=4;
        System.out.println(n+". wyraz ciagu Fibonacciego: "+fib(n));
        return;
}
}
