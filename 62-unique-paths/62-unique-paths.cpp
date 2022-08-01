class Solution {
    int helper(int m, int n, map<pair<int, int>, int>& umap) {
        if(m == 1 && n == 1)
            return 1;
        if(m == 0 || n == 0)
            return 0;
        if(umap.find({m, n}) != umap.end())
            return umap[{m, n}];
        if(umap.find({n, m}) != umap.end())
            return umap[{n, m}];
        umap[{m, n}] =  helper(m-1, n, umap) + helper(n-1, m, umap);
        return umap[{m, n}];
    }
public:
    int uniquePaths(int m, int n) {
        map<pair<int, int>, int> umap;
        return helper(m, n, umap);
    }
};