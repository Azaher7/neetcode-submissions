class Solution {
    public int majorityElement(int[] nums) {

        int count = 0; 
        Arrays.sort(nums);
        int temp = nums[0];
        int result = 0;
        

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==temp){
                count++;
                if (count>nums.length/2){
                    result = temp;
                }
            }
            else{
                count = 1;
                temp = nums[i];
            }
        }
        return result;
    }
}