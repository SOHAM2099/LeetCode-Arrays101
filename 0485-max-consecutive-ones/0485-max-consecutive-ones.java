class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1,count2=0;
        for(int i=0;i<nums.length;)
        {
            if(nums[i]==1)
            {
                count1=0;
                while((i<nums.length)&&(nums[i]==1))
                {
                    count1+=1;
                    i+=1;
                }
                if(count1>count2)
                    count2=count1;
            }
            else
                i+=1;
        }
        return count2;
    }
}