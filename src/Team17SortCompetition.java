public class Team17SortCompetition {

    public static void challengeOne(int [] arr)
    {
        arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 10000) + 1;
        }
    }
}
