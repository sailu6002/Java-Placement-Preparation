public class pattern01_square{
    public void solution(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern01_square s=new pattern01_square();
        int n=5;
        s.solution(n);
    }
}

/*
*****
*****
*****
*****
*****
*/
