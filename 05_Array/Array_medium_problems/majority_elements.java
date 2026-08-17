public class majority_elements {
    public int majority(int[] nums){
        int n=nums.length;
        int cunt=0;
        int e1=0;
        for(int i=0;i<n;i++){
            if(cunt==0){
                cunt=1;
                e1=nums[i];
            }
            else if(e1==nums[i]){
                cunt++;
            }
            else{
                cunt--;
            }
        }
        int cunt1=0;
        for(int i=0;i<n;i++){
            if(e1==nums[i]){
                cunt1++;
            }
        }
        if(cunt1 >=(n/2)){
            return e1;
        }
        return -1;
    }
    public static void main(String[] args) {
        majority_elements obj=new majority_elements();
        int[] nums={2,2,2,5,6,1,2,6};
        int result=obj.majority(nums);
        System.err.println("majority element: "+result);
        

    }
    
}
