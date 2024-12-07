import java.util.*;
public class ArraysExample {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
    
}
/*
 * 23
[23, 0, 0, 0, 0]
45
[23, 45, 0, 0, 0]
65
[23, 45, 65, 0, 0]
34
[23, 45, 65, 34, 0]
56
[23, 45, 65, 34, 56]
 */
