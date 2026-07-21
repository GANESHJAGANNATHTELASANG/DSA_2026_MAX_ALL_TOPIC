
public class arr_Left_Rotation_by_One {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int first_value = arr[0];

        for(int i=1; i<arr.length; i++ ){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first_value;

        for (int num : arr) {
        System.out.print(num + " ");
        }
 
        
    }

    
}
