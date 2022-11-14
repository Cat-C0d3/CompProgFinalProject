import java.util.ArrayList;
import java.util.Scanner;

public class DungeonCrawler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        int numDays = takeInput(in, map);
        int maxLoot = calculateMaxLoot(numDays, map);
        System.out.println(maxLoot);
    }

    private static int takeInput(Scanner in, ArrayList<ArrayList<Integer>> map){

        return -1;
    }

    private static int calculateMaxLoot(int numDays, ArrayList<ArrayList<Integer>> map){

        return -1;
    }

}
