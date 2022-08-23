public class InsertionSort {

    static int[] arr = {23, 53, 3, 56, 28, 90, 1};

    public static void main(String[] args) {
        System.out.println("Mang ban dau:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        System.out.println("mang da duoc sap xep:");
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];

            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {

                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}

