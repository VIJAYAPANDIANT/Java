/*

Array in Java

Definition:

An array in Java is a collection of elements of the same data type stored in contiguous memory locations.
It is used to store multiple values in a single variable.

Syntax:

-Declaration:

dataType[] arrayName;

-Initialization:

arrayName = new dataType[size];

-Declaration + Initialization:

dataType[] arrayName = {value1, value2, value3};

Types of Arrays in Java

1. One-Dimensional Array (1D)

Stores elements in a single row

Example: 

int[] arr = {1, 2, 3};

2. Two-Dimensional Array (2D)

Stores data in rows and columns (matrix)

Example:

int[][] arr = {
    {1, 2},
    {3, 4}
};

Example:

int[] numbers = {10, 20, 30, 40};

Program (1D Array):

class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println("Array Elements:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

Output:

Array Elements:
10
20
30
40

Program (2D Array):

class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4}
        };

        System.out.println("2D Array Elements:");

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

Output:

2D Array Elements:
1 2
3 4

Note:

Array size is fixed
Index starts from 0
All elements must be of same data type 

*/