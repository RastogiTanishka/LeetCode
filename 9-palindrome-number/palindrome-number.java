class Solution {
    public boolean isPalindrome(int x) {
        int digit =0;
        int reverseNum =0;
        int num =x;
        if(x<0) return false;
        while(x>0){
            digit = x%10;
            x = x /10;
            reverseNum = reverseNum*10 + digit;
        }
        return reverseNum == num;
    }
}