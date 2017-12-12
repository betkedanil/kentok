package lol;

import java.util.Scanner;

public class massive {
    private int[] mas;

    public massive(int size) {
        mas=new int[size];
    }
    public void show(){
        for(int i =0; i<mas.length; i++){
            System.out.println(""+mas[i]);
        }
    }
    public int size(){
        return mas.length;
    }
    public void vvod(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i <mas.length; i++){
            mas[i] = sc.nextInt();
        }
    }
    public int sum(){
        int sum=0;
        for(int i =0; i<mas.length ; i++){
            sum=sum+mas[i];
        }
        return sum;
    }
    public int chet(){
        int a=0;
        for(int i =0; i<mas.length ; i++){
        if(mas[i]%2==0){
            a++;
             }
        }
        return a;
    }
    public boolean pol() {
            for(int i =0; i<mas.length ; i++){
               if(mas[i]<=0){
                    return false;
                }
        }
        return true;
    }
    public void per(){
        for ( int i = 0, j = mas.length - 1; i < j; ++i, --j ) {
            int tmp = mas[i];
            mas[i] = mas[j];
            mas[j] = tmp;
        }
    }

    public int otr(int a, int b){
        int c=0;
        for(int i =0; i< mas.length; i++){
            if(mas[i]>=a&&mas[i]<=b){
            c++;
            }
        }
        return c;
    }
}
