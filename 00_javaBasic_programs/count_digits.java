

public class count_digits {
    /*public void countDigit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;

        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int n=234543223;
        count_digits c=new count_digits();
        
        c.countDigit(n);

    }
    */
   public static int countDigit(int n){
    if(n==0){
        return 1;
    }
        
    int count=0;   
    while(n>0){
        count++;
        n=n/10;

        }
       return count;
    }
    public static void main(String[] args){
        int n=234543223;
        System.out.println("number: "+n);
        int digit=countDigit(n);
        System.out.println(digit);
        
        

    }



    
}
