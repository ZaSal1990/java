public class isLeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year < 1 && year > 9999) {
            result = false;
        } else if (year >= 1 && year <= 9999) {
            int isDivisibleByFour = year % 4;
            if (isDivisibleByFour == 0) {
                int isDivisibleByHundred = year % 100;
                if (isDivisibleByHundred == 0) {
                    int isDivisibleByFourHundred = year % 400;
                    if (isDivisibleByFourHundred == 0) {
                        result = true;
                    } else result = false;
                } else result = false;
            } else result = false;
        }
        return result;
    }
}