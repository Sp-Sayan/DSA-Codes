public class DynamicArrayImpl {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        arr.add(5);
        arr.add(2);
        arr.display();
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.display();

//        arr.remove(2);
//        arr.display();

        //adding extra elements
        arr.add(7);
        arr.display();

        arr.clear();
        arr.display();

        System.out.println(arr);
    }

}
