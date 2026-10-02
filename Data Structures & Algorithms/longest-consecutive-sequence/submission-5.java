class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int count = 1;
        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int start : set) {
            if (!set.contains(start - 1)) {

                while (true) {
                    if (set.contains(start + 1)) {
                        count += 1;

                        if (count > max) {
                            max = count;
                        }

                        start = start + 1;
                    } else {
                        break;
                    }
                }
            }
            count=1;
        }

        return max;
    }
}