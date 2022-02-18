public class swapElements {
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 22;
        arr[1] = 42;
        arr[2] = 52;
        arr[3] = 62;
        arr[4] = 72;
        swap(arr, 2, 4 );
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
