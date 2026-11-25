class Solution {
    public int[] topKFrequent(int[] numbers, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int number : numbers) {
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        List<int[]> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            array.add(new int[] {entry.getValue(), entry.getKey()});
        }

        array.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = array.get(i)[1];
        }
        return result;   
    }
}
