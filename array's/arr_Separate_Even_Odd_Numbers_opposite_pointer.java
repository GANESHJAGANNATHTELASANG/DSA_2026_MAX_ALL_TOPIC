public class arr_Separate_Even_Odd_Numbers_opposite_pointer {
    public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left until an odd number is found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right until an even number is found
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap if pointers haven't crossed
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
