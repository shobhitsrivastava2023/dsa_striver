class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1 =1;
                ele1 = nums[i];
            }
            else if (cnt2 == 0 && ele1 != nums[i]){
                cnt2=1;
                ele2 = nums[i];

            }
            else if (nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }

        }

        List<Integer> ans = new ArrayList<>();
        cnt1 =0;
        cnt2 = 0;
         for (int i = 0; i < n; i++) {
            if (nums[i] == ele1) cnt1++;
            if (nums[i] == ele2) cnt2++;
        }

        int mini = (int)n/3 + 1;
        if(cnt1>=mini){
            ans.add(ele1);
        }
        if(cnt2>= mini){
            ans.add(ele2);
        }
        return ans;
        
    }

    
  
}