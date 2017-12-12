package string;

public class Payment {

    private String name;
    private String data;
    private int sum;
  //  private int hashCode;

    Payment(){
        this.name=name;
        this.data=data;
        this.sum=sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String data) {
        this.data = data;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.data;
    }

    public int getSum() {
        return this.sum;
    }
    public boolean equals(Payment a){
        if (this==a){
            return true;
        } else if(a==null){
            return false;
        } else if (getClass()!=a.getClass()){
            return false;
        }
        return true;
    }
    public int hashCode(){
        return this.hashCode();
    }
    public String toString(){
        return this.name+this.data+this.sum;
    }
}
