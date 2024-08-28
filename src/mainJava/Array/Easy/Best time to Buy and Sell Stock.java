import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    //int prices[] = {7,1,5,3,6,4};
    int prices[] = {7,6,4,3,1};


    System.out.println(maxProfit(prices));
  }

  public static int maxProfit(int prices[]) 
  {
    int buyValue=prices[0];
    int currentProfit=0;
    int MaxProfit=0;

    for(int i=0; i<prices.length; i++) 
    {
      if(buyValue<prices[i])   /* If the buyValue will be less then the next line */

      {
        currentProfit=prices[i]-buyValue;
        MaxProfit=Math.max(MaxProfit,currentProfit);
      }else 
      {
        buyValue=prices[i];
      }
    }
    return MaxProfit;
  }
}
