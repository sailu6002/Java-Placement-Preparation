//leetcode: 1295

public class evenDigit {
    public int findnumbers(int[] num){
        int count=0;
        for(int i=0;i<num.length;i++){
            if(even(num[i])){
                count++;
            }
        }
        return count;
    }
    public boolean even(int num){
        int numberofdigits=digit(num);
        if (numberofdigits%2==0){
            return true;
        }
        return false;

    }
    public int digit(int num){
        if(num<0){
            return num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num={12,345,2,6,7896};
        evenDigit obj=new evenDigit();
        System.out.println(obj.findnumbers(num));
    }
    
}
