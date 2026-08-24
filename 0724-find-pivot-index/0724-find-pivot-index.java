class Solution {
    public int pivotIndex(int[] arr){
       int rs=0;    
       for(int i=0;i<arr.length;i++){
        rs=rs+arr[i];
       }
       int ls=0;
       for(int i=0;i<arr.length;i++){
        rs= rs-arr[i];
        if(rs==ls){
            return i;
        }else{
            ls=ls+arr[i];
        }
       }
       return -1;
    }
}