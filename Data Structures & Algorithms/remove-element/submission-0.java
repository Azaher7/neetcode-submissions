class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;
        ArrayList<Integer> nums1 = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                k++;
                nums1.add(nums[i]);
            }
        }

        for (int i = 0;i<k;i++){
            nums[i] = nums1.get(i);
        }

        return k;
        
    }
}