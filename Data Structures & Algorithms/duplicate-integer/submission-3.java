class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*--------------BRUTE FORCE---------------
        int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;*/
        /*---------------BETTER-----------
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 1;i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;*/
        
        //-----------OPTIMAL-----------//
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}