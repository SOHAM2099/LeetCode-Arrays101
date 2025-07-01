class Solution {
    //SOHAM2099
    public boolean validMountainArray(int[] arr) {
        int slope=0;
        if(arr.length<3)
            return false;
        if(arr[1]<=arr[0])              //no up-slope
            return false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i])        //equal elements
                return false;
            if(arr[i+1]<arr[i])         //changing slope
                slope=1;
            if((slope==1)&&(arr[i+1]>arr[i]))       //down slope
                return false;
        }
        if(slope==0)                    //no down-slope
            return false;
        return true;
    }
}