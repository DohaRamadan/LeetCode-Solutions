class Solution {
public:
	void moveZeroes(vector<int>& nums) {
		int n = nums.size();
		int zerosCount = count(nums.cbegin(), nums.cend(), 0);
		int i = 0, index = 0;
		while (i < (n - zerosCount)) {
			if (nums[index] != 0) {
				nums[i] = nums[index];
				i++;
				index++;
			}
			else {
				index++;
			}
		}
		while (i < n) {
			nums[i] = 0;
			i++;
		}
	}
};