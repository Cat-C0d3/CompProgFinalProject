import java.util.Scanner;

public class FavoriteNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] range = getUserInput(in);
        //int numInvalidNumbers = getNumInvalid(range[0], range[1]);
        int numInvalidNumbersRefined = getNumInvalidRefined(range[0], range[1]);
        //System.out.println("getNumInvalid: " + numInvalidNumbers);
        System.out.println("getNumInvalidRefined: " + numInvalidNumbersRefined);
        //benchmark(range[0], range[1]);
    }

    private static int[] getUserInput(Scanner in){
        String[] inputLine = in.nextLine().split(" ");
        int[] range = new int[2];
        range[0] = Integer.parseInt(inputLine[0]);
        range[1] = Integer.parseInt(inputLine[1]);
        return range;
    }

    /**
     * Calculates the amount of numbers within a range that are not valid
     * @param lower the lower bound of the range, inclusive
     * @param upper the upper bound of the range, inclusive
     * @return an int representing the numbers within the range that
     * do not meet the specified criteria.
     * Valid numbers must be a multiple of 2, 3, or 5, but not 3 itself.
     */
    private static int getNumInvalid(int lower, int upper){
        int numInvalidNumbers = 0;
        int difference = upper-lower;
        if(difference > 0){
            int current;
            for (int i = 0; i < difference; i++){ //brute force solution
                current = lower + i;
                if (!(current != 3 && (current%2 == 0 || current%3 == 0 || current%5 == 0))){
                    numInvalidNumbers++;
                }
            }
        } else {
            return -1;
        }
        return numInvalidNumbers;
    }

    private static int getNumInvalidRefined(int lower, int upper){
        int numInvalidNumbers = 0;
        int difference = upper-lower;
        int startIndex = 0;
        // can automatically discount half of the range as even.
        if (lower%2 == 0){
            startIndex++; //ensures only odds are checked
        }
        if(difference > 0){
            int current;
            for (int i = startIndex; i < difference; i+=2){ //brute force solution
                current = lower + i;
                if (!(current != 3 && (current%3 == 0 || current%5 == 0))){
                    numInvalidNumbers++;
                }
            }
        } else {
            return -1;
        }
        return numInvalidNumbers;
    }

    private static void benchmark(int lower, int upper){
        long start = System.nanoTime();
        getNumInvalid(lower, upper);
        long end = System.nanoTime();
        System.out.println(end-start);
        start = System.nanoTime();
        getNumInvalidRefined(lower, upper);
        end = System.nanoTime();
        System.out.println(end-start);
    }
}
