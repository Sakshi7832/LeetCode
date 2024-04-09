class Solution {
    public String longestCommonPrefix(String[] strs) {
        // sort the array
        Arrays.sort(strs);        
        // take the first string length
        String first = strs[0];
        
        // take the last string length
        String last = strs[strs.length-1];

        String str = "";

        // traverse the loop for first string length and last string length
        for(int i=0;i<first.length() && i<last.length(); i++)
        {
            if(first.charAt(i)==last.charAt(i)) // compare the first string characters and last string characters 
            {
                str+=first.charAt(i);
            }
            else
            {
                break;
            }
        }
        return str;
        
    }
}