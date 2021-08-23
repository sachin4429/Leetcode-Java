class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String str : ops)
        {
            if(str.equals("D"))
                stack.push(stack.peek()*2);
            else if(str.equals("C"))
                stack.pop();
            else if(str.equals("+"))
                {
                    int temp = stack.pop();
                    int sum = temp + stack.peek();
                    stack.push(temp);
                    stack.push(sum);
                }
            else
                stack.push(Integer.parseInt(str));
        }
        int res = 0;
        for(int num : stack)
        {
            res+=num;
        }
        return res;
    }
}