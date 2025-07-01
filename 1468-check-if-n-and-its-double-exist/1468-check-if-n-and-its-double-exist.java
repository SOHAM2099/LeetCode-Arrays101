class Solution {
    //SOHAM2099
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[j]%2==0)&&(arr[j]/2==arr[i]))
                    return true;
                if(arr[j]*2==arr[i])
                    return true;
            }
        }
        return false;
    }
}