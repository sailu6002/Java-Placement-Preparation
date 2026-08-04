public class pattern10_righthalfpyramid {
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

    }
    public static void main(String[] args){
        pattern10_righthalfpyramid s1=new pattern10_righthalfpyramid();
        int n=5;
        s1.pattern(n);
    }
    
}
