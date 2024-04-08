import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int original_num = x;
        while(x>0)
        {
            int rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }

        if(rev==original_num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}