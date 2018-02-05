class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int l = findLengthOfShortestString(strs);
        
        String s1 = strs[0].substring(0,l);
        
        String prefix = findCommonPrefix(s1);
        
        return prefix;   
    }
    
    String findLengthOfShortestString(String[] s){
        
        int min = s[0].length();
        
        for(int i = 1; i <= s.length; i++){
            
            if(s[i].length() < min){
                
                min = s[i].length();
            }
        }
        
        return min;
        
    }
    
    String findCommonPrefix(String s){
            
            String result = null;
            left = s1.substring(0,(s1.length())/2);
            right = s1.substring((s1.length())/2, s1.length());
            
            for(int i = 0; i < strs.length; i++){
            if(strs[i].indexOf(left)==0){
                result += left;
                if(strs[i].indexOf(right)==left.length()){
                    result += right;
                }
                else{
                    findCommonPrefix(right);
                }
            }
            
            else{
                
                findCommonPrefix(left);
            }
                
            
        }
        
          return result;

        }
    
    
}
