package OOPs;
class ArrayList{
    int[] arr;
    int index = 0;
    int capacity ;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        arr[index++] = ele;
        size++;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
    ArrayList arr = new ArrayList(8);
        arr.add(10); arr.add(20);; arr.add(30);
        arr.display();
        System.out.println(arr.get(1));
//        System.out.println(arr.size);
    }
}
