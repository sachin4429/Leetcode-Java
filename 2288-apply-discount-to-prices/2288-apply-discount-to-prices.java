class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        for (int i = 0; i<words.length; i++)
        {
            if (words[i].charAt(0)=='$' && words[i].substring(1).matches("\\d+"))
            {
                String num = words[i].substring(1);
                double n = Double.parseDouble(num);
                double ans = n - ((double) n * discount / 100.00);
                String modifiedPrice = "$"+ String.format("%.2f", ans);
                words[i] = modifiedPrice;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) 
        {
            ans.append(words[i]);
            if (i< words.length-1)
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}