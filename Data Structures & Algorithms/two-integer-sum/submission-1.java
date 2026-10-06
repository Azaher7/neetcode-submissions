class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] addends = new int[2];
        
        for (int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if((nums[i]+nums[j]==target) && i!=j){
                    addends[0]=i;
                    addends[1]=j;
                }
            }

        }
        Arrays.sort(addends);
        return addends;
    }
}
