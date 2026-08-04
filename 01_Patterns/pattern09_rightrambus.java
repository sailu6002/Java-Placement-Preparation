public class pattern09_rightrambus {
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pattern09_rightrambus s1=new pattern09_rightrambus();
        s1.pattern(n);
        
    }}
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

    

