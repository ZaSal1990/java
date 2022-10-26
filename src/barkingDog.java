public class barkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay) {
        boolean result = false;
        if (!isBarking) {
            result = false;
        }
        else {
            if (hourOfTheDay < 0 && hourOfTheDay > 23) result = false;
            else if (hourOfTheDay > 0 && hourOfTheDay < 8) result = true;
            else if (hourOfTheDay > 22 && hourOfTheDay < 23) result = true;
        }
        return result;
    }
}