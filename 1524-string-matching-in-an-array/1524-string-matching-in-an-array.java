class Solution {
    public List<String> stringMatching(String[] w) {
        ArrayList<String> li=new ArrayList<>();
        int n=w.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                if(w[i].contains(w[j]) && !li.contains(w[j]))
                li.add(w[j]);

            }
        }
        return li;
    }
}