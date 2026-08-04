public class pattern02_rightangle{
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern02_rightangle s1=new pattern02_rightangle();
        int n=5;
        s1.pattern(n);

    } 
    
}
/*
*
* *
* * *
* * * *
* * * * *
    */
