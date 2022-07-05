class Solution {
public:
	void reverseString(vector<char>& s) {
		int i = 0; 
		int j = s.size() - 1; 
		char temp;
		while (i < j) {
			// swapping s[i] and s[j]
			temp = s[i];
			s[i] = s[j]; 
			s[j] = temp;
			i++;
			j--;
		}
	}
};