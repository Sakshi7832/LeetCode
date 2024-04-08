import java.util.Scanner;
class Solution {
    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> arraylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            int num = sc.nextInt();
            arraylist.add(num);
        }

        int[] nums = new int[arraylist.size()];

        for(int i=0;i<nums.length;i++)
        {
            nums[i] = arraylist.get(i);
        }

        int del = sc.nextInt();

        int res = removeElement(nums,del);
        System.out.println(res);


    }
}