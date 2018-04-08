class Solution{
    
    public double myPow(double x, int n){
        
      
        
        if(n==1)
            return x;
        if(n==0)
            return 1.0;
        
        if(n == Integer.MIN_VALUE){
        x = x * x;
        n = n/2;
    }
        
        if(n < 1){
             n = -n;
             return 1/myPow(x,n);
         }
    
        
        double ans = myPow(x,n/2);
        
        
        if(n%2==0)
            return ans*ans;
        else 
            return x*ans*ans;
        
       
}
}
