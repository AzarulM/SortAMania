public class Runner {

    public static void main(String[] args) {

        SortCompetition team17 = new Team17SortCompetition();

        int [] randIntsArr = randomIntsArr(10000);
        String[] randStringsArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);
        
        long time = System.currentTimeMillis();
        int median = team17.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntsArr);
    }
}
