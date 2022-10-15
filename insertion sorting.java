class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l; i++){
            insert(nums, i, nums[i]);
        }
        return nums;
    }
    public void insert(int[] a, int l, int k) {
        if(l < 1)return;
        for(int i = 0; i < l; i++){
            if(k < a[i]){
                int t = a[i];
                a[i] = k;
                k = t;
            }
        }
        a[l] = k;
        return;
    }
}
