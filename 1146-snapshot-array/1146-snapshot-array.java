// class SnapshotArray {
//     HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
//     ArrayList<Integer> arr;
//     int snapID = -1;
//     int capacity = 0;
//     public SnapshotArray(int length) {
//         arr = new ArrayList<Integer>(length);
//         for(int i =0; i<length; i++)
//         {
//             arr.add(0);
//         }
//         capacity = length;
//     }
    
//     public void set(int index, int val) {
//         if(index<capacity)
//             arr.set(index,val);
//     }
    
//     public int snap() {
//         snapID++;
//         map.put(snapID,new ArrayList<Integer>(arr));
//         return snapID;
//     }
    
//     public int get(int index, int snap_id) {
//         if(index<capacity)
//             return map.get(snap_id).get(index);
//         else
//             return -1;
//     }
// }

// /**
//  * Your SnapshotArray object will be instantiated and called as such:
//  * SnapshotArray obj = new SnapshotArray(length);
//  * obj.set(index,val);
//  * int param_2 = obj.snap();
//  * int param_3 = obj.get(index,snap_id);
//  */

class SnapshotArray {
        int arr[];
        List <int[]> snapShot;
        int maxIndex = 0;

        public SnapshotArray(int length) {
            arr = new int[length];
            snapShot = new ArrayList<>();
        }

        public void set(int index, int val) {
            if (index > maxIndex)
                maxIndex = index;
            arr[index] = val;
        }

        public int snap() {
            snapShot.add(Arrays.copyOfRange(arr, 0, maxIndex + 1));
            return snapShot.size()-1;
        }

        public int get(int index, int snap_id) {
            int arr[] = snapShot.get(snap_id);
            if (arr.length <= index) return 0;
            return arr[index];
        }
    }