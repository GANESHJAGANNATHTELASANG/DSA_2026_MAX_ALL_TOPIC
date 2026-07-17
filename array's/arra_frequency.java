public class arra_frequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40, 20};
        int target = 10;
        int frequency = 0;

        for(int i=0; i< arr.length; i++){
            if(target == arr[i]){
                frequency++;
            }
        }
        if(frequency==0){
            System.out.println("there no elemet" + target);
        }else{
            System.out.println("there are " + frequency + " frequency of " + target);
        }


    }
}
