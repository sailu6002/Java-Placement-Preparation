
public class sum_numbers {
    public int sum(int N){
        int sums=0;
        for(int i=0;i<=N;i++){
            sums+=i;
        }
        return sums;
    }
     // resursion: 
    public int digits(int N){
        if(N==1){
            return 1;
        }
        return N+digits(N-1);
     }

     // using formula
    public int formula(int N){
        return (N*(N+1)/2);
    }
    
    public static void main(String[] args){
        int N=10;
        sum_numbers a= new sum_numbers();
        int result=a.sum(N);
        int result2=a.digits(N);
        int result3=a.formula(N);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


    }
     
    
    
}
