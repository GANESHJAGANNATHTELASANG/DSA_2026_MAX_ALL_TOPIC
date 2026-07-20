public class arr_MoveZerosToEnd_optimized {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 5, 0};

        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] != 0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
