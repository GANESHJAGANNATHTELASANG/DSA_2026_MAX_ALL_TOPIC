public class arr_MoveZerosNested_two_loop{
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 5, 0};

        for (int left = 0; left < arr.length; left++) {

            if (arr[left] == 0) {

                for (int right = left + 1; right < arr.length; right++) {

                    if (arr[right] != 0) {

                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;

                        break;
                    }
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    


