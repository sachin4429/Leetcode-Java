class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 1)
            return duration;
        
        int result = duration;
        for(int i = 1; i<timeSeries.length; i++)
        {
            if(timeSeries[i-1]+duration>timeSeries[i])
                result += timeSeries[i]-timeSeries[i-1];
            else
                result += duration;
        }
        return result;
    }
}