import java.util.*;
public class Question1 {
    public static void main(String []args){
        Vector<Integer> v=new Vector<Integer>();
        for(int i=1;i<100;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                v.add(i);
            }
        }
        for(int i=0;i<=v.size()-2;i++){
            System.out.print("("+v.get(i)+","+v.get(i+1)+")"+",");
        }
    }
}
