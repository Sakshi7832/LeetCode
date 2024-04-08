import java.util.Scanner;
class Solution {
    public static int tribonacci(int n) {
        int first = 0;
        int second = 1; 
        int third = 1;
        int sum = 0;

        if(n==0)
        {
            return 0;
        }
        else if(n<=2)
        {
            return 1;
        }
        else
        {
            for(int i=3;i<=n;i++)
        {
            sum = first + second + third;
            first = second;
            second = third;
            third = sum;
        }

           return sum;

        }


    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tribonacci(n));
    }
}