
class Solution {

    HashMap<Character, Integer> toDict(String s) {
        HashMap<Character, Integer> dict = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }

        return dict;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> groups = new HashMap<>();

        for (String s : strs) {

            HashMap<Character, Integer> key = toDict(s);

            groups.putIfAbsent(key, new ArrayList<>());

            groups.get(key).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}