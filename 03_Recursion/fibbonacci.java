public class fibbonacci {
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }
        int first=fibbo(n-1);
        int second=fibbo(n-2);
        return first+second;

    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibbo(i)+" ");

        }
        
    }
    
    
}
