import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9//s]","");
        String rev = "";

        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

    }
}