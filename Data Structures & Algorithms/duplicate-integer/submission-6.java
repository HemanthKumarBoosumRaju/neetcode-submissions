class Solution {
    public boolean hasDuplicate(int[] nums) {
 if(nums.length==1) return false;
        if(nums.length==2) return nums[0]==nums[1];
        HashSet<Integer> result =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!result.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
