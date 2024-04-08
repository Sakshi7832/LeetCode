class Solution {
    public int myAtoi(String s) {

        if(s.length()==0)
        {
            return 0;
        }

        char[] ch = s.toCharArray();
        int i = 0;
        int sign = 1;
        int res = 0;

        while(i < ch.length && ch[i]==' ')
        {
            i++;
        }

        if(i < ch.length && ch[i]=='-')
        {
            sign = -1;
            i++;
        }
        else if(i < ch.length && ch[i]=='+')
        {
            i++;
        }

        for (; i < s.length() && i < ch.length && ch[i] >= '0' && ch[i] <= '9'; i++) {
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && ch[i] > '7')) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            res = res * 10 + ch[i] - '0';
        }

        return res*sign;
    }
}