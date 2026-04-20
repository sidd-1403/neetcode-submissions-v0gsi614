class Solution {
    public int removeDuplicates(int[] nums) {
     int k=1;
     int i=0;
     for(int j=1;j<nums.length;j++)
     {
        if(nums[i]!=nums[j])
        {
            k++;
            i++;
            nums[i]=nums[j];
        }
     }
     return k;   
    }
}