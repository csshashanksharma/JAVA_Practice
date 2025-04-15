public class QuickSort {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1,3,2,8,9};
        int n;
        n = 5;
        quickSort(a ,0,n-1);
        printArray(a,n);
    }
    public static void printArray(int []a ,int n)
    {
        for(int i = 0 ;i < n; i++)
        {
            System.err.print(a[i]);
        } 
        System.out.println("");
    }
    public static int partiton(int []a, int low, int high)
    {
        int pivot = a[low];
        int temp;
        int i = low + 1;
        int j = high;
        do
        {
            while (a[i] <= pivot)
            {
                i++;
            }
            while (a[j] > pivot)
            {
                j--;
            }
            if (i<j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while (i<j);
        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }
    public static void quickSort(int a[] , int low, int high)
    {
        int partition_index;
        if (low < high)
        {
            partition_index = partiton(a ,low, high);
            quickSort(a, low, partition_index-1);
            quickSort(a,partition_index+1,high);
        }

    }
}
