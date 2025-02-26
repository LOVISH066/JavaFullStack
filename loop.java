public class loop {

    public static void main(String[] args) {
        int arr[] = new int[100];
        int a = 1;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = a;
            System.out.println(arr[i]);
            a++;
        } 

    }
    
}
