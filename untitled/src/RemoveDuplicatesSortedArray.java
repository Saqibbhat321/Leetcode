public class RemoveDuplicatesSortedArray {


    public static int removeDuplicate(int[] arr)
    {
        int position =1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[position] =arr[i];
                position++;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,3,4,6,8,8,9,9,9};
       int length =  removeDuplicate(arr);
        System.out.println("Original Array elements:");
       for(int i: arr)
       {
           System.out.print(+arr[i]+" ");
       }
        System.out.println("\nOriginal Array length: "+arr.length);
        System.out.println("no of elements after removing duplicates: "+length);
        System.out.println("The Unique Elements are: ");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
