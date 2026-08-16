public class fibbonacci {
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }
        int fn=fibbo(n-1)+fibbo(n-2);
        return fn;

    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibbo(i)+" ");

        }
        
    }
    
    
}
