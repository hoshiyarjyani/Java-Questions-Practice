 //check again
 
 class selectionSort {
    public static void printarry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 8, 5, 7, 1, 3, 9, 6 };

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            //swaping

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarry(arr);
    }
}