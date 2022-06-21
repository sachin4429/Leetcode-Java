class Node
    {
        Node prev, next;
        int key, val;
        Node(int key, int val)
        {
            this.key = key;
            this.val = val;
        }
    }
class LRUCache {
    Node head = new Node(0,0), tail = new Node(0,0);
    HashMap<Integer, Node> map = new HashMap<>();
    int cap=0;
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node temp = map.get(key);
            remove(temp);
            insert(temp);
            return temp.val;
        }
        else
        {
            return -1;
        }    
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }
        if(map.size()==cap)
        {
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node)
    {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insert(Node node)
    {
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */