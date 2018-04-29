class Solution {
public:
    bool isPalindrome(string s) {
     if(s=="") return true;
        string s1 = "";
        for(int i=0;i<s.length();i++){
            if(isalnum(s[i])) s1+=s[i];
        }
        int n = s1.length();
        for(int i=0;i<n;i++){
            if(tolower(s1[i])!=tolower(s1[n-i-1])) return false;
        }
        
        return true;
    }
};
