public class arr_copy {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 20, 50, 20};
        int[] newArr = new int[arr.length];

        for(int i=0; i<arr.length ; i++){  
                newArr[i] = arr[i];
                System.out.println(newArr[i] + " ");
                      

        }
    }
    

}
