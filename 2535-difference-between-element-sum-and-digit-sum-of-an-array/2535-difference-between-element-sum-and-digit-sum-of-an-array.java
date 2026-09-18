class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int add=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(nums[i]>0){
                int a=nums[i]%10;
                add=add+a;
                nums[i]=nums[i]/10;
                
            }
        }
        return Math.abs(sum-add);

        
    }
}