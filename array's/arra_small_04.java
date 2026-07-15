public class arra_small_04 {
    public static void main(String[] args) {
         int[] arr = {10, 25, 7, 90, 45};
        int smallest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.print(smallest);
    }
    
}
