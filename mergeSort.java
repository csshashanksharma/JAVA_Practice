public class mergeSort
{
    public static void merge(int a[],int mid ,int low ,int high)
    {
        int i,j,k;
        i = low;
        k = low;
        j = mid+1;
        int b[] = new int[100];

        while(i <= mid && j<= high)
        {
            if(a[i] < a[j])
            {
                b[k] = a[i];
                i++;
                k++;
            }
            else{
                b[k] = a[j];
                j++;
                k++;
            }
        }
        while(i <= mid)
        {
            b[k] = a[i];
            i++;
            k++;
        }
        while(j <= high)
        {
            b[k] = a[j];
            j++;
            k++;
        }
        for(int m = low; m <= high; m++)
        {
            a[m] = b[m];
        }

    }
    public static void mergesort(int a[] ,int low,int high)
    {
        if(low < high)
        {
            int mid;
            mid = (low+high)/2;
            
            mergesort(a, low, mid);
            mergesort(a,mid+1,high);
            merge(a, mid, low, high);
        }
    }
    public static void printArray(int []a ,int n)
    {
        for(int i = 0 ;i < n; i++)
        {
            System.err.print(a[i]);
        } 
        System.err.println("");
    } 
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1,3,2,8,9};
        int n;
        n = 5;
        mergesort(a ,0,n-1);
        printArray(a,n);
    }
}