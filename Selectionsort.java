import java.util.Scanner;

public class Selectionsort 
{
    //O(n^2)
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<arr.length-1;i++)
        {
           int smallest=i;
           for(int j=i+1;j<arr.length;j++)
           {
            if(arr[smallest]>arr[j])
            {
                smallest=j;
            }
           }
           int temp=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;

        }
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}
