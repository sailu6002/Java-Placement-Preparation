public class res_numbers {
    public void printName(int current,int n){
        if(current<1){
            return ;
        }
        System.out.print(current+ " ");
        printName(current-1,n);
    }
    public void backtracking(int current,int n){
        if(current<1){
            return;
        }
        backtracking(current-1,n);
        System.out.print(current+ " ");
    }
    public static void main(String[] args){
        res_numbers a=new res_numbers();
        int n=10;
        a.printName(n,n);
        System.out.println();
        a.backtracking(n,n);

    }
    
}
