public class pattern06_pyramid {
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
    }
    public static void main(String[] args) {
        int n=5;
        pattern06_pyramid s1=new  pattern06_pyramid();
        s1.pattern(n);
}
    
}
/*
  *
   ***
  *****
 *******
*********
*/
