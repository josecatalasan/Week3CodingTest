package com.example.week3codingtest;

public class NtoTheM {

    public static void main(String[] args) {
        double n = 14;
        int m = 100;

        System.out.println(pow(n,m));
        System.out.println(pow(m,0));
        System.out.println(pow(n,-m));

    }

    private static double pow(double n, int m){
        if(m == 0)
            return 1;

        if(m < 0){ //negative exponent, return 1/ (n^m)
            if(n == 0){
                throw new IllegalArgumentException("Cannot raise 0 to the power of a negative number.");
            }
            return 1 / pow(n, -m);

        } else { //positive exponent

            double temp = pow(n, m / 2);

            if (m % 2 == 1) {
                return n * temp * temp;
            } else {
                return temp * temp;
            }
        }
    }
}
