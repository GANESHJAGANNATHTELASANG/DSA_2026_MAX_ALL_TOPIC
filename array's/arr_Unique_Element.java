public class arr_Unique_Element {
    public static void main(String[] args) {
        int [] arr = {1,3,4,4,3,1,2};
        int count = 0;
        int unique = arr[0];

        for(int i=0; i<arr.length; i++){
            count=0;
            for(int j=0;j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
              

            }

             if(count==1){
                unique = arr[i];
                System.out.println(unique);
                break;
            } 


        }

                   
        
    }
    
}
