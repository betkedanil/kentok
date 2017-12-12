package lol;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World.");
        System.out.println("Введите целочисленное число 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите целочисленное число 2: ");
        int b = sc.nextInt();
        System.out.println("Введите целочисленное число 3: ");
        int c = sc.nextInt();
        double mul =a*b*c;
        System.out.println("Умножение: "+mul);
        double m =(a+b+c)/(3.0);
        System.out.println("Среднее арифметическое: "+m);
        if(a==b&&b==c&&a==c){
            System.out.println("" + a+"\n"+ b+"\n" + c);
        }
        if(a<b&&a<c) {
            System.out.println("" + a);
            if(b<=c){
                System.out.println("" + b+"\n" + c);
            }
            else{
                System.out.println("" + c+"\n" + b);
            }
        }
        if(a>b&&b<c) {
            System.out.println("" + b);
            if(a<=c){
                System.out.println("" + a+"\n" + c);
            }
            else{
                System.out.println("" + c+"\n" + a);
            }
        }
        if(a>c&&b>c) {
            System.out.println("" + c);
            if(b>=a){
                System.out.println("" + a+"\n" + b);
            }
            else{
                System.out.println("" + b+"\n" + a);
            }
        }
    }
}