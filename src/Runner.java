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
        System.out.println("Challenge One Time: " + time * 0.001 + " Seconds");
        System.out.println("Median: " + median);

        System.out.println("Sorted");
        SortingAlg.printArr(randIntArr);


        /********************************************************************/

        long time2 = System.currentTimeMillis();
        String randString2 = SortingAlg.randomString(5);
        int idx2 = team17.challengeTwo(randomStringArr, randString2);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two Time: " + time2 * 0.001 + " Seconds");
        System.out.println("Position of '" + randString2 + "' : " + idx2);


        /********************************************************************/
        
        
        System.out.println("Not Sorted");
        SortingAlg.printArr(randIntArr);
        
        long time3 = System.currentTimeMillis();
        int median3 = team17.challengeOne(randIntArr);
        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge Three Time: " + time3 * 0.001 + " Seconds");
        System.out.println("Median: " + median3);
        
        System.out.println("Sorted");
        SortingAlg.printArr(randIntArr);


    }
}
