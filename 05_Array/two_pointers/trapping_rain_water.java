public class trapping_rain_water {
    public static int trapping(int[] height){
        int low=0;
        int high=height.length-1;
        int maxleft=0;
        int maxright=0;
        int water=0;
        while(low<high){
            if(height[low]<height[high]){
                if(height[low]>=maxleft){
                    maxleft=height[low];
                }
                else{
                    water+=maxleft-height[low];
                }
                low++;
            }
            else{
                if(height[high]>=maxright){
                    maxright=height[high];
                }
                else{
                    water+=maxright-height[high];
                }
                high--;

            }
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
       
        int result= trapping(height);
        System.out.print("trapping of water is: "+result);
        
    }
    
}
