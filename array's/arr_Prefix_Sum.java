public class arr_Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix = new int[arr.length];
         prefix[0] = arr[0];

         for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
         }
         for(int i=0; i<arr.length; i++){
            System.out.println(prefix[i] + " ");
         }
    }
}
