public class amstrong_number {
   /*  public boolean amstrong(int n){
        int sum=0;
        int original=n;
        int digit=String.valueOf(n).length();

        while(n>0){
            int rem=n%10;
            sum=sum+(int) Math.pow(rem,digit);
            n=n/10;
        }
        return original==sum;
    }
    public static void main(String[] args) {
        amstrong_number a=new amstrong_number();
        int n=153;
        if(a.amstrong(n)){
            System.out.println("amstrong number. "+n);
        }
        else{
            System.out.println("not amstrong numner. "+n);
        }
    }*/

        public boolean armstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        amstrong_number obj = new amstrong_number();

        int n = 153;

        if (obj.armstrong(n)) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
    
}
