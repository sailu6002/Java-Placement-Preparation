public class next_permutation {
    public void nextpermutation(int[] num){
        int n=num.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(num[i]<num[i+1]){
                ind=i;
                break;
            }
        }

        if(ind==-1){
            reverse(num,0,n-1);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(num[i]>num[ind]){
                swap(num,i,ind);
                break;


            }

        }
        reverse(num,ind+1,n-1);

    }
    private void  swap(int[] num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;

    }
    private void reverse(int[] num,int start,int end){
        while(start<end){
            swap(num,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        next_permutation obj=new next_permutation();
        int[] num={1,2,3};
        obj.nextpermutation(num);
        for(int nums: num){
            System.out.print(nums+" ");

        }
        System.err.println();
        
    }

    
}

