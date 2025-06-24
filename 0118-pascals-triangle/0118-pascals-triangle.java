
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li = new ArrayList<>();
        if (n == 1)
            return List.of(List.of(1));
        if (n == 2)
            return List.of(List.of(1), List.of(1, 1));

        List<Integer> l = new ArrayList<>();
        l.add(1);
        li.add(new ArrayList<>(l));

        l.add(1);
        li.add(new ArrayList<>(l));

        while (n-- > 2) {
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>(li.get(li.size() - 1));

            l1.add(1);
            int i = 0;
            while (i < l2.size() - 1) {
                l1.add(l2.get(i) + l2.get(i + 1));
                i++;
            }
            l1.add(1);
            li.add(l1);
        }
        return li;
    }
}
