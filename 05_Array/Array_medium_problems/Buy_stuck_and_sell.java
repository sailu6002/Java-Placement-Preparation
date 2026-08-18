public class Buy_stuck_and_sell{
    public static int buy(int[] price){
        int minprice=price[0];
        int maxprofit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]<minprice){
                minprice=price[i];
            }
            int profit=price[i]-minprice;
            if(profit > maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] price={7, 1, 5, 3, 6, 4};
        int result=buy(price);
        System.out.print("max profit is: "+result);
        
    }
}