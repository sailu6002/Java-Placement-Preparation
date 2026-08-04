public class pattern08_rambus {
     public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){                
                System.out.print("*");           
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){                
                System.out.print("*");           
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        pattern08_rambus s1=new  pattern08_rambus();
        s1.pattern(n);
}
    
    
}
