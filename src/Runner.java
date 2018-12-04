public class Runner {

    public static void main(String[] args) {

        SortCompetition team17 = new Team17SortCompetition();

        int [] randIntArr = SortingAlg.randIntArr(10000);
        String[]randomStringArr = SortingAlg.randomStringArr(10000,5);

        System.out.println("Not Sorted");
        SortingAlg.printArr(randIntArr);
        
        long time = System.currentTimeMillis();
        int median = team17.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortingAlg.printArr(randIntArr);

        long time2 = System.currentTimeMillis();
        String randString2 = SortingAlg.randomString(5);
        int idx2 = team17.challengeTwo(randomStringArr, );
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time Taken: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString2 + "' : " + idx2);
    }
}
