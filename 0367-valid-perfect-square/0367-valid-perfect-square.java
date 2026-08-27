class Solution {
    public boolean isPerfectSquare(int n) {
       int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid==n)
                return true;
            else if((long)mid*mid<n){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return false;
    }
} 