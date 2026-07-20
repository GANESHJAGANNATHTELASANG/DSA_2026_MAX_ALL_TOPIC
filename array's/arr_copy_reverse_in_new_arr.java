public class arr_copy_reverse_in_new_arr {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50, 20};
        int[] newArr = new int[arr.length];
        int j = 0;


        for(int i=arr.length - 1; i>=0; i--){  
                newArr[j] = arr[i];
                j++;
                      

        }

 
    }
    
}
