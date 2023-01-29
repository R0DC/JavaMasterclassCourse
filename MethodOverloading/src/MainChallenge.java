public class MainChallenge {

    public static void main(String[] args) {

        double centimeters = convertToCentimeters(68);
        System.out.println(centimeters);
        centimeters = convertToCentimeters(6,1);
        System.out.println(centimeters);
    }

    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightRemainingInches){
        return (heightFeet * 12 + heightRemainingInches) * 2.54;
    }
}
