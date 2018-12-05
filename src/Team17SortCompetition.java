public class Team17SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortingAlg.quicksort(arr, 0, arr.length - 1);
        return (SortingAlg.median(arr));
    }

    public int challengeTwo(String[] arr, String query);
    {
        SortingAlg.quicksortString(arr, 0, arr.length - 1);
        return (SortingAlg.ArrIdx(arr, query));
    }

    public int challengeThree(int[] arr);
    {
        SortingAlg.quicksort(arr, 0, arr.length - 1);
        return (SortingAlg.median(arr));
    }

    public int challengeFour(int[][] arr);
    {

    }

    public int challengeFive(Comparable[] arr, Comparable query);
    {

    }

    public String greeting()
    {
        return "Hello everyone! This is Team 17 Sort-A-Mania." ;
    }

}
