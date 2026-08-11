public class Insert {
    static void Printarray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30, 55, 50, 60, 44, 49 };
        Printarray(arr);
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        Printarray(arr);
    }
}
