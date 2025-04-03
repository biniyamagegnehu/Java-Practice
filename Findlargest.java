public class Findlargest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,33,40};
        int max;
        max = arr[0];
        for(int i=0; i<5; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
    }
}
