import java.util.HashSet;

public class longest_consecutive{
    public static int consecutive(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int count=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest=Math.max(longest,count);
            }

        }
        return longest;
    }
    public static void main(String[] args){
        int[] arr={100,4,200,3,2,1};
        int result=consecutive(arr);
        System.out.print("The longest consecutive sequence is: "+result);

    }
}