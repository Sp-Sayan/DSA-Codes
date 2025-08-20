import java.util.Arrays;

public class DynamicArray<T> {

    private Object[] arr;
    private int idx;

    DynamicArray(){
        arr = new Object[5];
        idx = -1;
    }

    public void add(T data){
        idx++;
        if(idx == arr.length){
            Object[] newArr = new Object[2* arr.length];
            //copy elements
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[idx] = data;
    }

    public  void remove(int index){

        if(index > idx || index < 0){
            throw new RuntimeException("Index out of Bounds");
        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        idx--;
    }

    public void display(){
        if(idx == -1) {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void clear(){
        arr = new Object[5];
        idx = -1;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "arr=" + Arrays.toString(arr) +
                ", idx=" + idx +
                '}';
    }
}
