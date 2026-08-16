public class reverse_number {
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        return rev;

    }
    public static void main(String[] args) {
        reverse_number s=new reverse_number();
        int n=1213;
        System.out.println(s.reverse(n));
    }
}
    

