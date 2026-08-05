public class prime_number {
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n=19;
        if(prime(n)){
            System.out.println("prime number: "+n);

        }
        else{
            System.out.println("not prime: "+n);
        }

    }
    
}
