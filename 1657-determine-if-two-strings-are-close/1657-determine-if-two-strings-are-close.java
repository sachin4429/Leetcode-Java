class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        //base case:
        if(word1.length()!=word2.length())return false;

        //to count the frequencies of every char in word1 and word2
        int count1[]=new int[26];
        int count2[]=new int[26];

        for(char ch:word1.toCharArray())
            count1[ch-'a']++;

        for(char ch:word2.toCharArray())
            count2[ch-'a']++;


        int count=0;//to count the number of character that match in word1 and word2
        for(int i=0;i<26;i++)
            if(count2[i]!=0)
                count+=count1[i];
        
        if(count!=word2.length())return false;
        
        //checking the frequencies of the count
        int freq1[]=new int[word1.length()+1];
        int freq2[]=new int[word1.length()+1];

        
        for(int x:count1)
            freq1[x]++;

        for(int x:count2)
            freq2[x]++;

        for(int i=0;i<word1.length()+1;i++)
            if(freq1[i]!=freq2[i])return false;//if the frequencies doesn't match then we cannot convert word1 into word2

        
        return true;
        
    }
}