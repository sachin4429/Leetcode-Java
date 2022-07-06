class Solution {
  int max;
  List<String> list;
  
  public List<String> generateParenthesis(int n) {
    this.max = n;
    this.list = new ArrayList<>();
    
    backtrack(0, 0, new StringBuilder());
    return list;
  }
  
  private void backtrack(int open, int close, StringBuilder sb) {
    if(open == max && close == max) {
      list.add(sb.toString());
      return;
    }
    
    if(open < max) {
      sb.append("(");
      backtrack(open + 1, close, sb);
      sb.deleteCharAt(sb.length() - 1);
    }
    
    if(close < open) {
      sb.append(")");
      backtrack(open, close + 1, sb);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
  
}


// class Solution {
//     public String insert(String bag, String marble, int index) {
//     String bagBegin = bag.substring(0,index);
//     String bagEnd = bag.substring(index);
//     return bagBegin + marble + bagEnd;
// }
//     public List<String> generateParenthesis(int n) {
//         HashMap<Integer, List<String>> hs = new HashMap<>();
//         for(int i = 1; i<=n; i++)
//             hs.put(i, new ArrayList<String>());
//         List<String> a = new ArrayList<>();
//         a.add("()");
//         hs.put(1,a);
//         if(n == 1)
//             return hs.get(1);
        
//         // ()(), (())
//         for(int i = 2; i<=n; i++)
//         {
//             List<String> arr = new ArrayList<>();
//             List<String> pre = hs.get(i-1);
//             for(String s : pre)
//             {
//                 int ind = 0;
//                 while(ind<s.length())
//                 {
//                     String temp = insert(s,"()",ind++);
//                     if(!arr.contains(temp))
//                         arr.add(temp);
//                 }
//             }
//             hs.put(i, arr);
//         }
//         return hs.get(n);
//     }
// }