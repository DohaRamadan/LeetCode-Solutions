class Solution {
public:
	bool checkInclusion(string s1, string s2) {
        if(s2.size() < s1.size())
            return false;
		int s1Size = s1.size(); 
        vector<int> s1Freq(26, 0); 
        vector<int> currWinFreq(26, 0); 
        for(char c : s1)
            s1Freq[c - 'a']++;
        for(int i=0; i<s2.size(); i++){
            currWinFreq[s2[i] - 'a']++;
            if(i >= (s1Size - 1)){
                if(currWinFreq == s1Freq)
                    return true;
                currWinFreq[s2[i - (s1Size - 1)] - 'a']--;
            }
        }
        return false;
	}
};
