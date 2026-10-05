class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n = s.length();
        int l=0;
        int r=n-1;
        while (l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l+=1;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r))){
                r-=1;
            }
            else if (s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
            l+=1;
            r-=1;
            }
        }
        return true;
    }
}
