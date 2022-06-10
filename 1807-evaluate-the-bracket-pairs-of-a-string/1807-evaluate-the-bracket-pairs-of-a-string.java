class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
      String ans="";
        for(int i=0;i<knowledge.size();i++){
          map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
          int j=s.indexOf(")",i);
          String temp=map.getOrDefault(s.substring(i+1,j),"?");
          ans=ans+temp;
          i=j;
        }
        else{
          ans=ans+s.charAt(i);
        }
      }
      return ans;
    }
}