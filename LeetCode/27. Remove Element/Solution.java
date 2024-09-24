class Solution {
    public static int removeElement(int[] nums, int val) {
        int newLength=0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[newLength++] = nums[i];
            }
        }
        return newLength;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int value = 2;
        int x = removeElement(arr,value);
        System.out.println(x);
    }
}