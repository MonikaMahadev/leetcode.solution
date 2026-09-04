class Solution {
    public int maxCoins(int[] piles) {
      Arrays.sort(piles);
      int left=0,right=piles.length-2,sum=0;
      while(left<right){
        sum=sum+piles[right];
        right=right-2;
        left++;
      }  
      return sum;
    }
}