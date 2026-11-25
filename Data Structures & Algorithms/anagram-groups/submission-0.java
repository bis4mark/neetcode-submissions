class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedA = new String(charArray);
            result.putIfAbsent(sortedA, new ArrayList<>());
            result.get(sortedA).add(s);
        }
        return new ArrayList<>(result.values());
        
        
    }
}
