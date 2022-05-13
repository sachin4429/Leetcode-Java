/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      if (root == null)
            return root;
        
        Node t = root;
        Node dummy = new Node();
        
        while (t != null) {
            Node current = dummy;
            while (t != null) {
                if (t.left != null) {
                    current.next = t.left;
                    current = current.next;
                }
                if (t.right != null) {
                    current.next = t.right;
                    current = current.next;
                }
                t = t.next;
            }
            t = dummy.next;
            dummy.next = null;
        }
        
        return root;  
    }
}