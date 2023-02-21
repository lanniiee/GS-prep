package searchAndSort;

public class Search {



    // binary search -> good when given an ordered arr O(log n)
    public static int findIndexOfIntBinary(int[] arr, int targetValue) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex)/2;

            if (targetValue < arr[middleIndex]) {
                highIndex = middleIndex - 1;
            } else if (targetValue > arr[middleIndex]) {
                lowIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }

    // linear search -> works better for unordered arr O(n) complexity
    public static int findIndexOfIntLinear(int[] arr, int targetValue) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numArr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        int number = 8;

        System.out.println(findIndexOfIntBinary(numArr, number));
        System.out.println(findIndexOfIntLinear(numArr, number));
    }


}
