class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0, j = skill.length-1;
        long sum = skill[i]+skill[j];
        long ans = 0;
        while(i<j)
        {
            if(skill[i]+skill[j] != sum)
                return -1;
            else
                ans += skill[i]*skill[j];
            i++;
            j--;
        }
        return ans;
    }
}