public class arr_Running_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int [] range_sum = new int [arr.length];
        range_sum[0] = arr[0];

        
        for(int i=1; i<arr.length; i++){
            range_sum[i] = arr[i] + range_sum[i-1];
        }

        System.out.println("the range sum is : " + range_sum);
    }
    
}
