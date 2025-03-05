public class Palindrome {
    public static boolean isPalindrome(int x) {
        int n = 0;
        int original=x;
        if(x<0){
            return false;
        }
        while (x>0) {
            int digit = x % 10;
            n = n * 10 + digit;
            x = x / 10;
        }
        if(n==original){
            return true;
        }
       else {
           return false;
        }
    }

    public static void main(String[] args) {
        int x = -121;
        int pal = 0;
        System.out.println(isPalindrome(x));

    }
}

