class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li = new ArrayList<>();
        if (n == 0)
            return li;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        li.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> prevRow = li.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            newRow.add(1);
            li.add(newRow);
        }

        return li;
    }
}
