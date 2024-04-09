class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i: nums)
        {
            if(set.add(i)==false)// if the value is present in the set
            {
                return true;
            }
        }
        return false;
    }
}