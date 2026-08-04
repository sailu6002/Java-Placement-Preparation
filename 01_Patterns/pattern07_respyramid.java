public class pattern07_respyramid {
    public void pattern(int n){
        for(int i=n;i>=1;i--){
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
        pattern07_respyramid s1=new  pattern07_respyramid();
        s1.pattern(n);
}
    
}
/*
*********
 *******
  *****
   ***
    *
*/
