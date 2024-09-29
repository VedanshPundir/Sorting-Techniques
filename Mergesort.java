import java.util.*;
public class Mergesort 

//O(nlogn)
 {
    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquere(arr,si,mid,ei);
    }
    public static void conquere(int arr[],int si,int mid,int ei)
    {
        int merge[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int k=0;
        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merge[k++]=arr[idx1++];
            }
            else{
                merge[k++]=arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merge[k++]=arr[idx1++];
        }
        while(idx2<=ei)
        {
            merge[k++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++)
        {
            arr[j]=merge[i];
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
        divide(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
}
