public class square_pattern{
    public void solution(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        square_pattern s=new square_pattern();
        int n=5;
        s.solution(n);
    }
}