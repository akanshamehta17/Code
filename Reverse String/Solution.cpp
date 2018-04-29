class Solution {
public:
    string reverseString(string s) {
        int n = s.length();
        if(n <= 0)
            return s;
        char chArray[n];
        string st = "";
        strcpy(chArray, s.c_str());
        for(int i=n-1;i>=0;i--){
            cout << chArray[i];
            st+= chArray[i];
        }
        
        return st;
        
        
        
    }
};
