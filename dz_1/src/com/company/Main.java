package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her
    }
    public static void ex1_3(){
        Scanner in =new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = (a + b)/2;
        String fd = String.format("%.2f", c);
        System.out.print(fd);

    }
    public static void ex1_4(){
        Scanner in =new Scanner(System.in);
        System.out.print ("Какая температура в Цельсиях?");
        double c = in.nextDouble();
        double f = 9*c/5+32;
        System.out.println("F=" + f );
    }
    public static void ex1_7(String[] args){
        int x = 1;
        for (int i = 0; i < args.length; i++) {
            int y=Integer.parseInt(args[i]);
           x =x * y;
        }
        System.out.println(x);


    }
}
