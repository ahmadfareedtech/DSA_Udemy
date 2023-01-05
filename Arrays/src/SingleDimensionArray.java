public class SingleDimensionArray {
    int arr[] = null; // public

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

    public void searchInArray(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found!");
    }

    public void deleteValue(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index provided is not in the range of array!");
        }
    }
}
