import java.util.Scanner;
class Solution {
    public static int lengthOfLastWord(String s) {
            String[] parts = s.split(" ");
	        String last = parts[parts.length-1];
	        int lengthLast= last.length();
	        return lengthLast;
	    }
	 
    }
