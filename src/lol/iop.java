package lol;

import java.util.Scanner;

public class iop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        massive array = new massive(size);
        System.out.println("Введите "+size+" элементов");
        array.vvod();
        array.show();
        int j = array.sum();
        System.out.println("Сумма всех элементов массива="+j);
        j= array.chet();
        System.out.println("Кол-во всех чётных элементов массива="+j);
        System.out.println("Введите границы отрезка");
        int a = sc.nextInt();
        int b = sc.nextInt();
        j= array.otr(a,b);
        System.out.println("Кол-во всех элементов массива на отрезке="+j);
        boolean h= array.pol();
        if(h==true){
            System.out.println("Все элементы положительны");
        } else if (h==false){
            System.out.println("Не все элементы положительны");
        }
        array.per();
        array.show();
    }
}
