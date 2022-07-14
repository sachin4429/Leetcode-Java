class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] vacant = new int[rocks.length];
        long totalVacancy = 0;
        for(int i = 0; i<rocks.length; i++)
        {
            vacant[i] = capacity[i] - rocks[i];
            totalVacancy += vacant[i];
        }
        if(totalVacancy<additionalRocks)
            return rocks.length;
        Arrays.sort(vacant);
        int ans = 0;
        for(int i = 0; i<rocks.length; i++)
        {
            //System.out.println(vacant[ans]);
            if(additionalRocks>0)
            {
                additionalRocks -= vacant[i];
                if(additionalRocks>=0)
                    ans++;
            }
            else 
                break;
        }
        return ans;
    }
}