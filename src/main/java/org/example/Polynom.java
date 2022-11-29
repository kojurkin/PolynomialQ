package org.example;

public class Polynom {
    private int degree;
    private int[] coef = new int[degree + 1];

    public Polynom(int degree, int[] coef) {
        if (degree > 0 && degree + 1 == coef.length){
            this.degree = degree;
            this.coef = coef;
        } else {
            System.out.println("Something isnt works");
        }
    }

    public int getDegree() {
        return degree;
    }

    /*public boolean isHave() {
        for(int i = 0; i < coef.length; i++) {

        }
    }*/

    /*public void toString() {

    }*/

    /*public int getCoef(int n) {
        return coef[n];
    }*/

    public double calculating(double variable) {
        double result = 0;
        int n = this.degree;
        for(int i = 0; i <= n; i++) {
            result += this.coef[i] * Math.pow(variable, i);
        }
        return result;
    }
}
