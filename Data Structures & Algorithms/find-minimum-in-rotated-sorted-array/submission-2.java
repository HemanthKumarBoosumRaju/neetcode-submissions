class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if (nums.length==2){
            if(nums[0]>nums[1]) return nums[1];
            else return nums[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==0 || nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[end]<nums[mid]){
               start=mid+1;
            }
            else if (nums[mid]<nums[start]){
                end=mid-1;
            }
            else return nums[start];
        }
        return -1;
    }
}
