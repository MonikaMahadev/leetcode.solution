class Solution {
    public int findlistlength(List<Integer>og,List<Integer>sorted){
        int m=og.size(),n=sorted.size();
        int dp[][]=new int [m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(og.get(i-1).equals(sorted.get(j-1))){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer>og=new ArrayList<>();
        for(int num:nums)og.add(num);
        Set<Integer>set=new TreeSet<>();
        for(int num:nums)set.add(num);
        List<Integer>sorted=new ArrayList<>(set);
        return findlistlength(og,sorted);
    }
}