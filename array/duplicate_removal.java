// approach : store the first variable in a variable and count as 1 run
//  the loop from  1 to length. add new members to the same array if you find different element from num and change num to present .
// return count
class Solution {
    public int removeDuplicates(int[] arr) {
        int num=arr[0];
        int count=0;
        // arr[count++]=num;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=num)
            {
                arr[count++]=arr[i];
                num=arr[i];
            }
        }
        return count;
    }
}