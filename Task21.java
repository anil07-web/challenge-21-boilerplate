public class Task21 {
    public static void main(String[] args) {
        int arr[]={20,10,15,12,40};
        sort(arr);
        
    }
    public static void sort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int num: arr) {
            System.out.print(num+ " ");
        }
    }
    
}
