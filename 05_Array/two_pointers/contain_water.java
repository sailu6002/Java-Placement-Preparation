// leetcode 11: we have to find how much water coverd area
public class contain_water {
    public static int water(int[] height){
        int low=0;
        int high=height.length-1;
        int maxwater=0;
        while(low<high){
            int width=high-low;
            int minheight=Math.min(height[low], height[high]);
            int area=width*minheight;
            if(area>maxwater){
                maxwater=area;
            }
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int result=water(height);
        System.out.print("maxwater that covered in area is : "+result);
    }

}
    
