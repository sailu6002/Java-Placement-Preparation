public class pattern03_numtriangle {
   
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       pattern03_numtriangle s1=new pattern03_numtriangle();
        int n=5;
        s1.pattern(n);
    }

}
    

