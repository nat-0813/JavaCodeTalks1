public class ArraySorting {
    import java.util.Arrays;

    public class ArraySorting {
        public static void main(String[] args) {
            int[] numbers = {5, 2, 8, 1, 9};
            Arrays.sort(numbers);
            System.out.print("Sorted Array: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

}

//Answer:
//The code demonstrates sorting an array of integers in Java using the Arrays.sort method.
//It first declares and initializes an int array called numbers with the values {5, 2, 8, 1, 9}.
//This is the unsorted array.
//It then calls Arrays.sort and passes the numbers array as the argument.
//Arrays.sort is a static method that sorts the array in-place - rearranging the elements within the original array object.
//After sorting, the array will be ordered as {1, 2, 5, 8, 9}.
//To display the sorted array, a for-each loop is used to print out each element separated by a space.
//So this shows how sorting arrays in Java can be accomplished easily using the built-in Arrays.sort method.
//The sort uses an optimized algorithm to reorder the elements efficiently.
//This code can work with arrays of any primitive data type like ints, doubles, etc.
//The sort order will be ascending by default.
