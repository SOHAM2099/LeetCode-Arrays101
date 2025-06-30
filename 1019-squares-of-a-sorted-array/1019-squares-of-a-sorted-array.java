class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
            arr[i]=nums[i]*nums[i];
        Arrays.sort(arr);
        return arr;
        
    }
}