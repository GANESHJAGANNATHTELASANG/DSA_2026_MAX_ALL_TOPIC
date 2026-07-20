public class arr_Separate_Even_Odd_Numbers {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};

        int left = 0;

        for(int right = 0; right < arr.length; right++ ){
            if(arr[right]%2==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }

        }
         for (int num : arr) {
            System.out.print(num + " ");
        }



    }
    
}
