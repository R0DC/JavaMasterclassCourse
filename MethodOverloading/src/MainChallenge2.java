public class MainChallenge2 {

    public static void main(String[] args) {
        int seconds = 3945;
        System.out.println(getDurationString(seconds));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "Invalid data for seconds +" + seconds;
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Check the inputs";
        }

        int remainderMins = minutes % 60;

        int hours = minutes / 60;

        return (hours + "h " + remainderMins + "m " + seconds + "s");
    }
}
