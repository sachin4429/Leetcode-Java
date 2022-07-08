class Solution {
    public String capitalizeTitle(String str) {
        String[] strArray = str.split(" ");
        String res = "";
        for(String s : strArray)
        {
            if(s.length()<=2)
                res += s.toLowerCase();
            else
            {
                char ch = Character.toUpperCase(s.charAt(0));
                String sub = s.substring(1).toLowerCase();
                res += ch+sub;
            }
            res +=" ";
        }
        return res.trim();
    }
}