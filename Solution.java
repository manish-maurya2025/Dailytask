public class Solution {

    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        Solution obj = new Solution(); // ✅ correct spelling

        int[] arr = {12, 35, 1, 10, 34, 1};

        int result = obj.getSecondLargest(arr);
        System.out.println(result);
    }
}

