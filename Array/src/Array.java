import java.util.Random;

/**
 * Created by Man on 19.12.2016.
 */
public class Array {
        public static void main(String[] args)
        {
            int[] arr=new int[11];
            Random rand=new Random();
            for(int i=0;i<10;i++)
            {
                arr[i]=rand.nextInt(20);
            }
            out(arr);

            ShakerSort(arr);
            out(arr);
            System.out.println("Minimum is "+arr[0]);
            Reverse(arr);
            out(arr);
            System.out.println("Maximum is "+arr[0]);
            System.out.println("Average is "+average(arr));

        }
        public static int[] ShakerSort(int[] arr){
            int left=0;
            int right=arr.length-1;
            // int count =0;
            while(left<=right)
            {
                for(int i=left;i<right;i++)
                {
                    // count++;
                    if(arr[i]>arr[i+1])
                    {
                        Swap(arr,i,i+1);
                    }
                }
                right--;
                for(int i=right;i>left;i--)
                {
                    // count++;
                    if (arr[i-1]>arr[i])
                    {
                        Swap(arr,i-1,i);
                    }
                }
                left++;
            }


            return arr;}
        public static void Swap(int[]arr,int a,int b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        public static int[] Reverse(int[]arr)
        {
            int temp=0;
            for(int i=0;i<arr.length /2;i++)
            {
                temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length -i-1]=temp;
            }
            return arr;
        }
        public static void out(int[]arr){
            for(int i=0;i<arr.length ;i++)
            {
                System.out.printf("%d \t",arr[i]);

            }
            System.out.println("");
        }
        public static int average(int[] arr){
            int sum=0;
            int aver=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            aver=sum/arr.length;
            return aver;
        }
    }


