class Solution {
    //SOHAM2099
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
    for(int i=0;i<nums.length;i++)
    {
        int m=Math.abs(nums[i])-1;
        nums[m]=-1*Math.abs(nums[m]);
    }
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]>0)
            result.add(i+1);
    }

    return result;
    }
}