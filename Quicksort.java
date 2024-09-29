import java.util.Scanner;

public class Quicksort 
{
    public static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        
            for(int j=low;j<high;j++)
            {
                if(arr[j]<pivot)
                {
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }  
            i++;
            int temp=arr[i];
            arr[i]=pivot;
            arr[high]=temp;
        
        return i;
        
        }
    public static void Quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivot=partition(arr,low,high);

        Quicksort(arr,low,pivot-1);
        Quicksort(arr,pivot+1,high);
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter elements in array:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        Quicksort(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.err.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}
