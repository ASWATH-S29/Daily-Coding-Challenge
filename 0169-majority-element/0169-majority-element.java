class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s=nums.length;
        return nums[s/2];
    }
}