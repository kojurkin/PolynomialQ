package org.example;

public class Main {
    public static void main(String[] args) {
        int coefic[] = {1, 6, -3, 15};
        Polynom p = new Polynom(3, coefic);
        System.out.println(p.calculating(10.5));
    }
}