public class arr_Remove_Duplicates_Sorted {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4,4,4,5,5};
        int point = 0;

        System.out.println(arr[0]);

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[point]) {
                point++;
                arr[point] = arr[i];
            }
        }

        // Print after processing is complete
        for(int j = 0; j <= point; j++) {
            System.out.print(arr[j] + " ");
        }
        

    }
    
}







