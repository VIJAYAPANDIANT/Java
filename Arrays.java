/*
Array in Java

Definition:
- An array in Java is a collection of elements of the same data type stored in contiguous memory locations.
- It is used to store multiple values in a single variable.

Syntax:
- Declaration:
  dataType[] arrayName;
- Initialization:
  arrayName = new dataType[size];
- Declaration + Initialization:
  dataType[] arrayName = {value1, value2, value3};

Types of Arrays in Java:
1. One-Dimensional Array (1D)
   - Stores elements in a single row.
2. Two-Dimensional Array (2D)
   - Stores data in rows and columns (matrix).
*/

class Arrays {
    public static void main(String[] args) {
        // --- 1D Array Example ---
        int[] arr = {10, 20, 30, 40};
        System.out.println("1D Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        System.out.println();

        // --- 2D Array Example ---
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        System.out.println("2D Array Elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}