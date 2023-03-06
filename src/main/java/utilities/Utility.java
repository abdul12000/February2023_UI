package utilities;

import java.util.Random;

public class Utility {

    public static int generateRandomNumbers(){
        Random ran = new Random();
        int fourRanNums = ran.nextInt(1000);
        return fourRanNums;
    }
}
