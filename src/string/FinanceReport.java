package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinanceReport {
    private List<Payment> array= new ArrayList<Payment>();
    public void add(Payment a){
       array.add(a);
    }
    public Payment get(int i) {
        if(i > 0 && i < array.size() ) {
            return array.get(i);
        }
        return new Payment();
    }
    public void set(int i, Payment nbill) {
        if(i > 0 && i < array.size()) {
            array.set(i, nbill);
        }
    }
    public int numberOfPayments() {
        return array.size();
    }

    public void printList(char s) {
        int rub=0, kop=0 ;
        for(int i = 0;i<array.size(); i++) {
            Payment n = array.get(i);
            rub=n.getSum()/100;
            kop=n.getSum()-rub*100;
            if (n.getName().charAt(0) == s) {
                System.out.println("ФИО:" + n.getName() + "; Дата:" + n.getDate() + "; Сумма:" + rub+"руб"+kop+"коп");
            }
        }
    }
    public void vivod(int chislo){
        int rub=0, kop=0 ;
        for(int i = 0;i<array.size(); i++) {
            Payment n = array.get(i);
            if(chislo>n.getSum()){
                rub=n.getSum()/100;
                kop=n.getSum()-rub*100;
                System.out.println("ФИО:" + n.getName() + "; Дата:" + n.getDate() + "; Сумма:" + rub+"руб"+kop+"коп");
            }
        }
    }
    public FinanceReport clone(){
        return this.clone();
    }
}