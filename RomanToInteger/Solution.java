class Solution {
    public int romanToInt(String s) {
        
        char[] ch = s.toCharArray();
        int result = 0;
        
        for(int i = 0; i <= ch.length-2; i++){
            if(getVal(ch[i]) >= getVal(ch[i+1]))  /* If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
                                                     else subtract this value by adding the value of next symbol to the running total. */
                result += getVal(ch[i]);
            else
                result -= getVal(ch[i]); 
        }
        
        return result+getVal(ch[ch.length-1]);
    }
    
    public int getVal(char c){
        
        int num = 0;
        
        switch(c){
                
        case 'I': num = 1;
                  break;
                 
        case 'V': num = 5;
                  break;
                  
        case 'X': num = 10;
                  break;
                
        case 'L': num = 50;
                  break;
                
        case 'C': num = 100;
                  break;
                
        case 'D': num = 500;
                  break;
                
        case 'M': num = 1000;
                  break;
                
        default:  System.out.println("Invalid Roman Number");
        }
        
        return num;
        
    }
    
    public static void main(String[] args){
        
        Solution s = new Solution();
        int res = s.romanToInt("MCMXCVI");
        System.out.println("Result is:" + res);
        
    }
}
