class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int m=mat.length;
        int n=mat[0].length;
        int high=m*n-1;
        int left=0;
      while(left<=high)
        {
           int mid=(left+high)/2;
           int row=mid/n;
           int col=mid%n;
           if(mat[row][col]==t)
           {
            return true;
           }
           else if(mat[row][col]>t)
           {
            high=mid-1;
           }
           else
           {
              left=mid+1;
           }
        }
        return false;
    }
}