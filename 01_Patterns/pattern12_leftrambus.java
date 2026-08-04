public class pattern12_leftrambus {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        pattern12_leftrambus s1=new pattern12_leftrambus();
        int n=5;
        s1.pattern(n);
    }
    
}
/*
  *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
