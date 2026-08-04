public class pattern11_resrighthalfpyramid {
    public void pattern(int n){
        for(int i=n;i>=1;i--){
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
        pattern11_resrighthalfpyramid s1=new pattern11_resrighthalfpyramid();
        int n=5;
        s1.pattern(n);
    }
    
}
