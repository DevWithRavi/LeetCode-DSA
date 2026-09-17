class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int pal=0;
        while(n!=0){
            if(n<0){
            return false;
            }
            int rem=n%10;
            pal=pal*10+rem;
            n=n/10;}
            if( pal == x){
                return true;
            }
    return false;
}
}