public class farward_n_numbers {
    public void printName(int current, int n){
        if(current>n){
            return ;
        }
        System.out.print(current+" ");
        printName(current+1, n);
        
    }
    public void back_tracking(int current,int n){
        if(current>n){
            return ;
        }
        back_tracking(current+1, n);
        System.out.print(current+" ");
    }
    public static void main(String[] args) {
        farward_n_numbers sol=new farward_n_numbers();
        int n=5;
        sol.printName( 1,n);
        System.out.println();
        sol.back_tracking(1, n);
    }
}
