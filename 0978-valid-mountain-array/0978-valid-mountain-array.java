class Solution {
    //SOHAM2099
    public boolean validMountainArray(int[] arr) {
       /* int slope=0;
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
        return true;*/

        if (arr.length < 3)
            return false;

        int left = 0;
        int right = arr.length - 1;

        // Move left pointer up while strictly increasing
        while (left + 1 < arr.length && arr[left] < arr[left + 1])
            left++;

        

        // Move right pointer down while strictly decreasing
        while (right - 1 >= 0 && arr[right - 1] > arr[right])
            right--;
        
        // Both pointers must meet at the peak and not be at the ends
        return left > 0 && right < arr.length - 1 && left == right;
    }
}