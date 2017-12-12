package lol;

import java.util.Scanner;

public class tab {
    public static void main(String[] args) throws ErrorCZero {
        System.out.println("Задайте нижний предел табуляции: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Задайте верхний предел табуляции: ");
        double b = sc.nextDouble();
        System.out.println("Задайте шаг табуляции: ");
        double c = sc.nextDouble();

        if (c<=0||a>=b){
            throw new ErrorCZero();
        }

        double D=a,s=0;
        do{
            s=Math.sin(D);
            System.out.println("sin(x)=: "+s);
            D=D+c;
        }while(D<=b);
    }
}
