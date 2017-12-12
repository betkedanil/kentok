package string;

public class srong {
    public String slip(String s,int N ){
        StringBuilder str = new StringBuilder();
        if(N==0){
            return "";
        }
        else if(N<0) {
            throw new NullPointerException("lol");
        }else {
            for (int i=0; i<N;i++) {
                str.append(s);
            }
            return str.toString();
        }
    }
    public int kolvhod(String S, String G){
        int c=0, p=0;
        for(int i=0;i<S.length();){
            p = S.indexOf(G);
            if(p==-1){
                return 0;
            } else{
                c++;
                i=p;
            }
        } return c;
    }
    public String zamena(String S){
               String str= S.replace("1","один");
                str= S.replace("2","два");
                str= S.replace("3","три");
                return str;
    }
    public StringBuilder Del(StringBuilder S){
        for(int i=0; i<S.length();i++ ){
            if(i%2==0){
                S.deleteCharAt(i);
            }
        }
        return S;
    }
}
