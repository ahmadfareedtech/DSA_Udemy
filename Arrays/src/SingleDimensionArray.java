public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.MIN_VALUE;
    }

    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted!");
            } else {
                System.out.println("this cell is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        } catch (Exception e) {
            System.out.println("Array no longer exist!");
        }

    }
}
