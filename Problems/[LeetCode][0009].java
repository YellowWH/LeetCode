class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if(x>=0){
            for(int i = 0; i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}

自己第一次做出来的题目
