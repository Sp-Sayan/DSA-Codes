public class DynamicArrayImpl {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>();

        arr.add("Hello");
        arr.add("World");

        System.out.println(arr.toString());

        DynamicArray<Integer> arr2 = new DynamicArray<>();

        arr2.add(12);
        arr2.add(122);

        System.out.println(arr2.toString());
    }
}
