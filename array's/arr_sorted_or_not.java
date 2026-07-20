public class arr_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean sorted = true;

        for(int i=0; i< arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }else{
                sorted = true;
            }
        }
        if(!sorted){
            System.out.println("the arr is not sorted ");
        }else{
            System.out.println("the arr is sorted");
        }
    }
    
}
