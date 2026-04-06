class SelectionSorts {
    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 6, 7, 1, 8, 4, 3};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int Index = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[Index]) {
                    Index = j;
                }
            }

            int temp = arr[Index];
            arr[Index] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
