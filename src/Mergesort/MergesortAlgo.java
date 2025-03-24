package Mergesort;

public class MergesortAlgo {
    public void merge(int[]arr,int low,int mid,int high)
    {
        int n = arr.length;
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[]left = new int[n1];
        int[]right = new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++)
        {
            right[j] = arr[mid+1+j];
        }
        int i=0,j=0,idx=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[idx] = left[i];
                i++;
                idx++;
            }
            else
            {
                arr[idx] = right[j];
                j++;
                idx++;
            }
        }
        while(i<n1)
        {
            arr[idx] = left[i];
            i++;
            idx++;

        }
        while(j<n2)
        {
            arr[idx] = right[j];
            j++;
            idx++;
        }
    }

    public void mergesort(int[]arr,int low,int high)
    {
        if(low == high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void print_array(int[]arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
