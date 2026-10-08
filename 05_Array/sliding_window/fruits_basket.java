import java.util.HashMap;

public class fruits_basket{
    public static int basket(int[] fruits){
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxans=0;
        int left=0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0 )+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxans=Math.max(maxans,right-left+1);
        }
        return maxans;
    }
    public static void main(String[] args) {
        int[] fruits={1,2,3,2,3,2};
        int result=basket(fruits);
        System.out.println("maximum length of the ruits basket: "+result);
    }
}