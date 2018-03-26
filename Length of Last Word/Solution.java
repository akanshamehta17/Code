class Solution {
    public int lengthOfLastWord(String s) {
       
        String st = s.trim();
       if(st=="")
           return 0;
        
        if(st.indexOf(' ') <  0){
            return st.length();
        }
        
        char[] ch = st.toCharArray();
        int n = ch.length;
        StringBuffer str = new StringBuffer();
        
        
        for(int i = n-1; i >= 0 ; i--){
            if(ch[i]==' '){
                for(int j=i+1; j<n;j++){
                    str.append(ch[j]);
                }
                System.out.println(str);
                break;
            }
            
        }
        
        return str.length();
    }
}
