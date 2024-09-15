// approach : make an temporary array and store the  rotated values in this . copy into original array

class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        
        for(int i =0;i<nums.length;i++){
            a[(i+k)%nums.length]=nums[i];
        }

        for(int i =0;i<nums.length;i++){
            nums[i]=a[i];
        }

    }
}