public class speedConverter {
    public static void main(String[] args){
        printConversion(1.5);
    }

    public static long milesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0){
            return Math.round((long) (kilometersPerHour / 1.609));
        }
        return -1;

    }
    public static void printConversion(double kilometersPerHour) {
        long result = milesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + "km/h = " + result + "mi/h");
    }

}