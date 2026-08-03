class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 =  new HashMap<>();
        toFreqMap(map, s);

        toFreqMap(map2, t);

        return map.equals(map2);
        
    }

    private HashMap<Character, Integer> toFreqMap (HashMap<Character, Integer> map, String s) {
        char[] charArr = s.toCharArray();

        for (char c: charArr) {
            if (map.containsKey(c)) {
                Integer freq = map.get(c);
                freq++;
                map.put (c, freq);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
