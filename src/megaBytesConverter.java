public class megaBytesConverter {

    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes > 0 ) {
            int megaBytePortion = Math.round(kiloBytes / 1000);
            int kiloBytePortion = (kiloBytes - (megaBytePortion * 1024));
            System.out.println(megaBytePortion + "MB and " + kiloBytePortion + "KB");

        }
        else System.out.println("Invalid");
    }
}
