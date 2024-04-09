class Solution {
    public boolean isAnagram(String s, String t) {
        // covert the string into lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        // convert the string into array
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        // sort the array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // if both the strings length are equal and if both the arrays are equal 
        //then the string are anagram otherwise not

        if(s.length()==t.length() && Arrays.equals(ch1, ch2))
        {
            return true;
        }
        return false;
    }
}