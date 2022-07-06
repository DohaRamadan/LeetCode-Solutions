class Solution {
public:
	int lengthOfLongestSubstring(string s) {
		int n = s.size();
		vector<int> maxes(n);
        if(n == 0)
            return 0;
        for(int i=0; i<n; i++){
            maxes[i] = 0;
        }
		for (int i = 0; i < n; i++) {
			string substring = "";
			substring += s[i]; 
			for (int j = i + 1; j < n; j++) {
				if (substring.find(s[j]) != -1)
					break;
				substring += s[j];
			}
			maxes[i] = substring.size(); 
		}
		int maximumLength = *max_element(maxes.begin(), maxes.end()); 
		return maximumLength; 
	}
};