public class Team17SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortingAlg.quicksort(arr, 0, arr.length - 1);
        return (SortingAlg.median(arr));
    }
}
