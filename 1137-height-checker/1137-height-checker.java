class Solution {
    //SOHAM2099
    public int heightChecker(int[] heights) {
       
        int[] expected=new int[heights.length];
        int index=0;
        for(int a:heights)
            expected[index++]=a;
        Arrays.sort(expected);
        
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
                count++;
        }
        return count;
    }
}