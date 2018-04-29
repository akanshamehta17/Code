class Solution {
public:
    int firstUniqChar(string s) {
        
        map<char,int> m;
        for(auto u : s){
            auto ku = m.find(u);
            if(ku==m.end()) m.insert({u,1});
            else
                ku->second+=1;
        }
        
        for(int i=0;i<s.length();i++){
            auto kv = m.find(s[i]);
            if(kv->second==1) return i;
            
        }
        
        return -1;
          
    } 
};
