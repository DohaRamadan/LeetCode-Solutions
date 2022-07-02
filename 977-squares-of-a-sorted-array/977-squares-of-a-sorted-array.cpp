class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> squrs(nums.size()); 
        for(int i=0; i<nums.size();i++){
            squrs[i] = nums[i] * nums[i];
        }
        sort(squrs.begin(), squrs.end()); 
        return squrs; 
    }
};