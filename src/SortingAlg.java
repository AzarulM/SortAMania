public class SortingAlg
{

    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num --;
            arr[num] = s;
        }
        return arr;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static void swapInt(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static String randomString(int length)
    {
        String str = "";
        int i = 0;
        while (i < length)
        {
            char c = (char) ((Math.random()*26)+97);
            str = str + c;
            i++;
        }
        return str;
    }
    public static void quicksort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr,left,right);

            quicksort(arr,left,pivot - 1);
            quicksort(arr,pivot + 1, right);
        }
    }

    public static int partition(int[]arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left; j < right; j++)
        {
            if(arr[j] < pivot) {
                i++;
                swapInt(arr, i, j);
            }
        }
        swapInt(arr,i + 1, right);
        return i + 1;
    }

    public static void quicksort(String[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivot = partition(arr,left,right);

            quicksort(arr,left,pivot - 1);
            quicksort(arr,pivot + 1, right);
        }
    }

    public static int partition(String[]arr, int left, int right)
    {
        String pivot = arr[right];
        int i = left - 1;
        for(int j = left; j < right; j++)
        {
            if(arr[j].compareTo(pivot) <= 0) {
                i++;
                swapString(arr, i, j);
            }
        }
        swapString(arr,i + 1, right);
        return i + 1;
    }

    public static void printArr(int[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }

    public static void printArr(String[] arr)
    {
        String str = "";
        for (int i = 0; i < arr.length; i++)
        {
            str = str + arr[i] + " ";
        }
        System.out.println(str);
    }

    public static int median(int [] arr)
    {
        if (arr.length % 2 == 0)
        {
            int middleArr = (arr.length / 2) - 1;
            return ((arr[middleArr] + arr[middleArr + 1]) / 2);
        }
        else
        {
            int middle = (arr.length/2) - 1;
            return (arr[middle]);
        }
    }

    public static int ArrIdx(String[] arr, String query)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i].equals(query))
                return i;
        }
        return -1;
    }
}

