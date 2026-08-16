public class sort_colors {
    public void colors(int[]  nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int[] nums={2,0,2,1,1,0};
        sort_colors obj=new sort_colors();
        obj.colors(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    
}
