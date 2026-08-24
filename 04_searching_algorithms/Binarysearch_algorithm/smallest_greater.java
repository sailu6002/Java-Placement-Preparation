//leetcode 744 - Find Smallest Letter Greater Than Target
public class smallest_greater {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return letters[low%letters.length];
        
    }
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        char target= 'x';
        smallest_greater obj=new smallest_greater();
        char result=obj.nextGreatestLetter(letters, target);
        System.out.print(result);

    }
    
}

