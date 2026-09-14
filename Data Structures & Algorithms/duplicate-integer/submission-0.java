class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> J = new HashSet<>();
        for (int i:nums)
        {
            if(J.contains(i)){
                return true;
            }
            else J.add(i);
        }
        return false;
    }
}