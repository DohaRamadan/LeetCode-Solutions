class Solution {
    void dfs(vector<vector<int>>& image,int sr, int sc, int newColor, int rows, int cols, int sourceColor){
        if(sr < 0 || sr >= rows || sc < 0 || sc >= cols)
            return;
        else if(image[sr][sc] != sourceColor)
            return ;
        image[sr][sc] = newColor; 
        dfs(image, sr+1, sc, newColor, rows, cols, sourceColor); 
        dfs(image, sr-1, sc, newColor, rows, cols, sourceColor); 
        dfs(image, sr, sc+1, newColor, rows, cols, sourceColor); 
        dfs(image, sr, sc-1, newColor, rows, cols, sourceColor); 
    }
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
       if(image[sr][sc] == color)
           return image;
        int rows = image.size(); 
        int cols = image[0].size(); 
        int sourceColor = image[sr][sc]; 
        dfs(image, sr, sc, color, rows, cols, sourceColor); 
        return image;
    }
};