public class GCD {
    /*public int greatest(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1% i==0 && n2 %i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int n1=12;
        int n2=18;
        GCD a=new GCD();
        System.out.println(a.greatest(n1, n2));
    }*/

    public int greatest(int n1, int n2) {

        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 18;

        GCD obj = new GCD();

        System.out.println("GCD = " + obj.greatest(n1, n2));
    }
    
}
