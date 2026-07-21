public class arr_right_Rotation_by_One {
    public static void main(String[] args) {
         int[] arr = {10, 20, 30, 40, 50};
        int last_value = arr[0];

        for(int i=arr.length-1; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last_value;

        for (int num : arr) {
        System.out.print(num + " ");
        }
        
    }
    
}




