public class palindrome {
    public boolean palin(int i, String s){
        if(i>s.length()/2){
            return true;
        }
        if(s.charAt(i) !=s.charAt(s.length()-i-1)){
            return false;

        }
        return palin(i+1, s);
    }
    public static void main(String[] args){
        palindrome obj=new palindrome();
        String s="madam";
        System.out.println(obj.palin(0,s));

    }
    
}
