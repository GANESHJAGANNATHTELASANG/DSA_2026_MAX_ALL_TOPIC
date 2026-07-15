public class arra_largest_num {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 90, 45};
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.print(largest);
    }
    
}
