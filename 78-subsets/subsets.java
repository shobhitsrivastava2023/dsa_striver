
class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        backtrack(nums, 0, stack, result);
        return result;
    }

    private void backtrack(int[] nums, int start, Stack<Integer> stack, List<List<Integer>> result) {
        result.add(new ArrayList<>(stack));
        for (int i = start; i < nums.length; i++) {
            stack.push(nums[i]);
            backtrack(nums, i + 1, stack, result);
            stack.pop();
        }
    }
}
