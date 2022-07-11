class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int count=0,top=0;
        for(int i:students) q.add(i);
        
        while(!q.isEmpty() && count!=q.size()){
            if(q.peek()==sandwiches[top]){
                count=0;
                top++;
                q.remove();
            }else{
                q.add(q.remove());
                count++;
            }
        }
        return q.size();
    }
}