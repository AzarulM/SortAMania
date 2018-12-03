public class Runner {

    public static void main(String[] args) {

        SortCompetition team17 = new Team17SortCompetition();

        int [] randIntArr = SortingAlg.randIntArr(10000);
        String[]randomStringArr = SortingAlg.randomStringArr(10000,5);

        System.out.println("Unsorted");
        SortingAlg.printArr(randIntArr);
        
        long time = System.currentTimeMillis();
        int median = team17.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        SortingAlg.printArr(randIntArr);
    }
}
