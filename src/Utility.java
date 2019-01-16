 public class Utility {

        public static void stringSwap (String[] arr, int i, int j)
        {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void bubbleSort (String[] arr)
        {
            int thru = 1;
            while (thru > 0) {
                thru = 0;
                for (int x = 0; x < arr.length-1; x++)
                {
                    if (arr[x].compareToIgnoreCase(arr[x + 1])>0)
                    {
                        stringSwap(arr,x,x+1);
                        thru++;
                    }
                }
            }
        }


        public static String[] arr ( int count)
        {
            String[] arr = new String[count];
            int i=0;
            String s="";
            while(i<arr.length)
            {
                char c=(char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            return arr;
        }

     public static int[] arrInt ( int count)
     {
         String[] arr = new String[count];
         int i=0;
         int n=0;
         while(i<arr.length)
         {
             n=(int)((Math.random()*11)-1);
             i++;
         }
         return arrInt(7);
     }

        public static boolean sortCheck(int[]arr)
        {
            for(int x=0; x<arr.length-1;x++)
            {
                if(arr[x]>arr[x+1])
                {
                    return false;
                }
            }
            return true;
        }


        public static boolean sortCheck(double[]arr)
        {
            for(int x=0; x<arr.length-1;x++)
            {
                if(arr[x]>arr[x+1])
                {
                    return false;
                }
            }
            return true;
        }


        public static boolean sortCheck(String[]arr)
        {
            for(int x=0; x<arr.length-1;x++)
            {
                if(arr[x].compareTo(arr[x+1])>0)
                {
                    return false;
                }
            }
            return true;
        }

        public static boolean checkSum(int[]before, int[]after)
        {
            int sum=0;
            for(int x=0; x<before.length; x++)
            {
                sum=sum+before[x];
            }
            int other=0;
            for(int y=-0; y<after.length; y++)
            {
                other=other+after[y];
            }
            if(sum==other)
            {
                return true;
            }
            return false;
        }

        public static void doubleSwap (double[] arr, int i, int j)
        {
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void intSwap (int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void selectionSort(double[] arr)
        {
            int minPos=0;
            double minVal=0;
            for(int curPos=0; curPos<arr.length-1; curPos++)
            {
                minVal=arr[curPos];
                minPos=curPos;
                for(int i=0; i<arr.length; i++)
                {
                    if(minVal>arr[i])
                    {
                        minVal=arr[i];
                        minPos=i;
                    }
                }
                doubleSwap(arr,curPos,minPos);
            }

        }

        public static void insertionSort(int[]arr){
            for (int curPos=0; curPos<arr.length; curPos++){
                if(arr[curPos]>arr[curPos+1]){
                    for (int x= curPos; x>=0; x--){
                        if (arr[curPos]>arr[curPos+1]) {
                            intSwap(arr, curPos, curPos + 1);
                        }
                    }
                }
            }
        }

    }
