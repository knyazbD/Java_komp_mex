package com.company;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static void e2_3() {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int y = 0;
        for (int i = 0; i < (x.length() - 1); i++){
            if ((x.charAt(i) == '1')  & (x.charAt(i+1) == '1')){
                y++;
            }
        }
        System.out.print(y);
    }
    public static void e2_4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Число <пробел> i-ый бит");
        int x = in.nextInt();
        int i = in.nextInt();
        if((x | (Math.pow(2, i))) == 0){
            x = x - Math.pow(2, i);

        }
        else {
            x = x - Math.pow(2, i) - Math.pow(2, i);
        }
        System.out.print(x);
        }
        public static void e4_4() {
        int [] num =new int[]{1,-34, 8, 14, -5, 0};
        int x = 0;
        for( int i = i; i<num.length; i++ ){
            if( ((num[i] >= 0) && (num[i-1] < 0) || ((num[i] <= 0) && (num[i-1] > 0)) {
                x++;
            }
            System.out.print(x);
        }
    }
    public static void e5_3(){
        Scanner in = new Scanner(System.in);
        System.out.print("1.количество 2. числа через пробел ");
        int size = in.nextInt()
        int b;
        int n1, n2, n3, n4, n5, n6, n7, n8, n9;
        n1 =0;
        n2 =0;
        n3 =0;
        n4 =0;
        n5 =0;
        n6 =0;
        n7 =0;
        n8 =0;
        n9 =0;
        for (int i = 0; i < size; i++) {
            b = in.nextInt();
            switch(b){
                case 1:
                    n1 ++;
                case 2:
                    n1 ++;
                case 3:
                    n1 ++;
                case 4:
                    n1 ++;
                case 5:
                    n1 ++;
                case 6:
                    n1 ++;
                case 7:
                    n1 ++;
                case 8:
                    n1 ++;
                case 9:
                    n1 ++;
            }
            int x = 0;
            int y = 0;
            int [] num = {n1,n2,n3,n4,n5,n6,n7,n8,n9};
            for(int a = 0; a > num.length; a++ ){
                if(x<num[i]){
                    x = num[i];
                    y = i
                }
                Formatter f = new Formatter();
            System.out.print(f.format("Больше всего %s. Их %s штук", y, x));
            }




        }

    }
    
}
