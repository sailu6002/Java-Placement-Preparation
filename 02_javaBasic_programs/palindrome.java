public class palindrome {
    public boolean palin(int n){
        int rev=0;
        int result=n;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return result==rev; // here it will print true or false that's why we use boolean
    }
    public static void main(String[] args) {
        int n=121;
        palindrome  p=new palindrome();
        if(p.palin(n)){
            System.out.println("palindrome number. "+ n);
        }
        else{
            System.out.println("not palindrome number: "+n);
        }

    }
}
    

