class Solution {
    public int[] minOperations(String b) {
        int[] arr=new int[b.length()];
        int n=b.length();
        for(int i=0;i<n;i++)
        {
            int res=0;
            for(int j=0;j<n ;j++)
            {
                if(j!=i)
                if(b.charAt(j)=='1')
                {
                        res+=Math.abs(i-j);
                }
            }
            arr[i]=res;
        }
        return arr;
    }
}