class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<List<String>>();
        String keyWord ="";
        for(int i = 0; i<searchWord.length(); i++)
        {
            keyWord = searchWord.substring(0,i+1);
            int count = 0;
            List<String> innerres = new ArrayList<String>();
            for(int j = 0; j<products.length; j++)
            {
                if(products[j].startsWith(keyWord))
                {
                    if(count == 3)
                        break;
                    count++;
                    innerres.add(products[j]);
                }
            }
            res.add(innerres);
        }
        return res;
    }
}