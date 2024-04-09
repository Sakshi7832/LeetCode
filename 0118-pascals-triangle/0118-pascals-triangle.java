class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            int factorial = 1;

            for(int j=0;j<=i;j++)
            {
                row.add(factorial);
                factorial = factorial * (i-j)/(j+1);
            }
            res.add(row);
        }
        return res;
        
    }
}