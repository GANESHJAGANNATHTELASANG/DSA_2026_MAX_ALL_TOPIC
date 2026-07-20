public class arr_Left_Rotation_by_k_time {
    public static void rotation_left_by_k(int arr[], int start, int end){
        
        while ( start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            
        }
    }
    public static void main(String[] args) {
                int[] arr = {10, -5, 0, 8, -2, 0, 7};
                int k = 3;
                k = k % arr.length;

rotation_left_by_k(arr, 0, k - 1);

rotation_left_by_k(arr, k, arr.length - 1);

rotation_left_by_k(arr, 0, arr.length - 1);

for (int num : arr) {
    System.out.print(num + " ");
}


        
    }
}
