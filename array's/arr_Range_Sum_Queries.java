
public class arr_Range_Sum_Queries {

    public static int  sum(int left, int right, int [] prefix){
        if(left == 0){
            int summ = prefix[right];
            return summ;
        }else{
            int summ = prefix[right] - prefix[left-1];
            return summ;
        }
       


    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 6, 1, 4};
        int [] prefix = new int [arr.length];
        prefix[0] = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        int left = 1;
        int right = 4;

        int total =sum(left, right, prefix);

        System.out.println("the summ from index" + left + " to " + right + "sum is " + total);



    }
    
}
