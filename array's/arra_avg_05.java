public class arra_avg_05 {
    public static void main(String[] args) {
                 int[] arr = {10, 25, 7, 90, 45};
                 int n = arr.length;
                 double avg = 0;
                 int sum = 0;
                 for(int i=0; i<arr.length;i++){
                    sum+=arr[i];
                 }
                 avg = (double)sum/n;

                 System.out.print(avg);
                    }
    
}
