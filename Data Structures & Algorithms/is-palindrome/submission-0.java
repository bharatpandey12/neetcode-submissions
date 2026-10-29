class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l = 0;
        int h = str.length()-1;
        while(l<h){
            if(str.charAt(l)!=str.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    }
}
