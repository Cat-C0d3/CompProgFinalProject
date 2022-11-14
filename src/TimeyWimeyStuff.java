import java.util.Scanner;

public class TimeyWimeyStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] date = new int[3];
        int[] time = new int[2];
        takeUserInput(in, date, time);
        calculateTimeOnPlanetX(date, time);
        calculateTimeOnPlanetY(date, time);
        calculateTimeOnPlanetZ(date, time);
    }

    private static void takeUserInput(Scanner in, int[] date, int[] time){
        //load in date
        String[] current = in.nextLine().split("/");
        for(int i = 0; i < 3; i++){
            date[i] = Integer.parseInt(current[i]);
        }
        // load in time
        current = in.nextLine().split(":");
        time[0] = Integer.parseInt(current[0]);
        time[1] = Integer.parseInt(current[1]);
    }

    private static void calculateTimeOnPlanetX(int[] date, int[] time){
        // Time on planet x moves 1.002% faster than ET.
        int[] newDate = new int[3];
        int[] newTime = new int[2];

        System.out.println(newDate[0] + "/" + newDate[1] + "/" + newDate[2]);
        System.out.println(newTime[0] + ":" + newTime[1]);
    }

    private static void calculateTimeOnPlanetY(int[] date, int[] time){
        // Time on planet y is 4 hours ahead of planet x, which is 1.002% faster than ET.
        int[] newDate = new int[3];
        int[] newTime = new int[2];

        System.out.println(newDate[0] + "/" + newDate[1] + "/" + newDate[2]);
        System.out.println(newTime[0] + ":" + newTime[1]);
    }

    private static void calculateTimeOnPlanetZ(int[] date, int[] time){
        // On Planet z, a day is 20 hours, instead of the usual 24.
        int[] newDate = new int[3];
        int[] newTime = new int[2];

        System.out.println(newDate[0] + "/" + newDate[1] + "/" + newDate[2]);
        System.out.println(newTime[0] + ":" + newTime[1]);
    }
}
