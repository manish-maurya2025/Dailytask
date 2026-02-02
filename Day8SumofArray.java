public class Day8SumofArray {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,9};
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}
