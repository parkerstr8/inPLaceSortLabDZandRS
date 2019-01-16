public class Runner
{
    public String[] randomStringArr(int num, int length)
    {
        String[] arr= new String[num];
        while(num>0)
        {
            int i = 0;
            String s= "";
            while(i<length)
            {
                char c=(char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }

    public int[] randomIntArr(int num, int length)
    {
        int[] arrInt= new int[num];
        while(num>0)
        {
            int i = 0;
            int n= 0;
            while(i<length)
            {
                n=(int)((Math.random()*11)-1);
                i++;
            }
            num--;
            arrInt[num]=n;
        }
        return arrInt;
    }

    public double[] doubleArr()

    public static void main(String args[])
    {

        String[] testArr = Utility.arr(7);
        int[] testArr2= Utility.arrInt(7);
        System.out.println("Before: ");
        for(String num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        Utility.bubbleSort(testArr);
        System.out.print("After: ");
        for (String num : testArr)
        {
            System.out.print(num + " ");
            System.out.println();
        }
        String[] testArrs = Utility.arr(7);
        System.out.println("Before: ");
        for(String num:testArrs) {
            System.out.print(num + " ");
            System.out.println();
        }
        Utility.insertionSort(testArr2);
        System.out.print("After: ");
        for (int num : testArrs)
        {
            System.out.print(num + " ");
            System.out.println();
        }

        Utility.sortCheck(testArr);
    }


}

