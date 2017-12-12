package lol;

import java.util.Scanner;

public class lin {
    public static void main(String[] args) throws Error123 {
        System.out.println("Введите коэфициент при x^2: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Введите коэфициент при x: ");
        double b = sc.nextDouble();
        System.out.println("Введите константу: ");
        double c = sc.nextDouble();
        double D = b*b-4*a*c;
        if((a==0&&b==0)||(b==0&&c==0)||(a==0&&c==0)){
            throw new Error123();
        }
        if(D<0){
            System.out.println("Корней нет ");
        } else if(D==0){
            double x1= (-1*b)/(2*a);
            System.out.println("1 корень="+x1);
        } else if(D>0){
            double x1= (-1*b+Math.sqrt(D))/(2*a);
            double x2= (-1*b-Math.sqrt(D))/(2*a);
            System.out.println("2 кореня x1="+x1+" и x2="+x2);
        }
    }
}
