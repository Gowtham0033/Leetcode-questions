class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& a, vector<int>& b) {
        int n = a.size();
        vector<int> ans(n,0);
        vector<int> count(n+1,0);
        int prev = 0;
        for(int i = 0; i<n;i++){
            count[a[i]]++;
            count[b[i]]++;
            int equal = 0;
            if(count[a[i]] == 2) equal++;
            if(count[b[i]] == 2) equal++;
            if(a[i] == b[i]) equal--;
            ans[i] = prev + equal;
            prev = ans[i];
        }
        return ans;

    }
};
