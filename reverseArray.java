public class reverseArray {
    static void reverse( int []arr, int i, int j){
        if( i>j )
            return ;
        else{
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        reverse( arr, i+1, j-1 );
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int n = arr.length-1;
        reverse(arr, 0, n);
        for( int i=0; i<=n; i++)
            System.out.print( arr[i]+ ", ");
    }
}
