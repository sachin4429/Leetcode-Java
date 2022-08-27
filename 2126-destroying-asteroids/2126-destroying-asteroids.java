class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long planet = mass;
        for(int i : asteroids)
        {
            if(planet<i)
                return false;
            planet +=i;
        }
        return true;
    }
}