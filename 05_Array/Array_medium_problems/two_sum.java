import java.util.*;
public class two_sum {
    public  int[] sum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {nums[i],nums[j]};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args){
        two_sum obj=new two_sum();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=obj.sum(nums, target);
        System.out.print("two sum elements: ");
        for(int num:result){
            System.out.print(num+ " ");
        }
    }
    
}
