
public class N_times {
    public void printName(int count,String name, int n){
        if(count==n){
            return;
        }
        System.out.println(name);
        printName(count+1,name,n);
    }
    public static void main(String[] args) {
        N_times a= new N_times();
        int n=5;
        String name="sailu";
        a.printName(0,name,n);
       
        
    }

    
}
