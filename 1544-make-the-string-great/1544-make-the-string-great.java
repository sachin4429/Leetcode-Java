class Solution {
    public String makeGood(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         for(int i = 0; i<sb.length()-1; i++)
//         {
//             if(sb.charAt(i)+0 == sb.charAt(i+1)+32)
//             {
//                 sb.deleteCharAt(i+1);
//                 sb.deleteCharAt(i);
//                 i--;
//             }
                
//         }
//         return sb.toString();
        Stack<Character> st = new Stack<Character>();
        for(char ch : s.toCharArray())
        {
            if(st.isEmpty())
                st.add(ch);
            else if(st.peek()+32 == ch+0)
                st.pop();
            else if(st.peek()+0 == ch+32)
                st.pop();
            else
                st.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st)
            sb.append(ch);
                return sb.toString();
    }
}