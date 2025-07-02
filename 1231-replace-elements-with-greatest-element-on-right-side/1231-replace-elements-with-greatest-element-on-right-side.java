class Solution {
    //SOHAM2099
    public int[] replaceElements(int[] arr) {
        
        int maxindex=find_maxindex(arr,0);
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(i==maxindex)
                maxindex=find_maxindex(arr,i);
            
            arr[i]=arr[maxindex];
        }
        arr[arr.length-1]=-1;
        return arr;
    }
    public int find_maxindex(int[] arr,int k)
    {
        int max=arr.length-1;
        for(int i=arr.length-1;i>k;i--)
        {
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
}