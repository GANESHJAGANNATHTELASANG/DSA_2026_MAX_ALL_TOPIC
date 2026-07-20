public class arr_compare_two_arr {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 50, 30, 40};
        boolean same = true;

       if(arr1.length == arr2.length){
         for(int i =0; i< arr1.length; i++){
            if(arr1[i] != arr2[i]){
                same = false;
                break;
            }
            

        }
       }else{
        System.out.println("the two array have doffrent size we cant compare ");
       }

       if(!same){
        System.out.println("the array is not same");
       }else{
        System.out.println("the two array are same");
       }

    }
    
}
