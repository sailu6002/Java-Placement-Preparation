public class search_char {
    public static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
       String name="sailu";
       char target='l';
       System.out.println(search(name, target));

    }
    
}
