public class JavaHomework26_10_22 {

    public static void main(String[] args) {
        BurgHalifaWhile();
        BurgHalifaDoWhile();
    }

    static void BurgHalifaWhile() {
        int maxFloors = 163;
        int currentFloor = 0;

        int count = 0;

        while (currentFloor <= maxFloors) {
            currentFloor = currentFloor + 5 - 1;
            count++;
        }

        System.out.println("Number of iterations is " + count);
    }

    static void BurgHalifaDoWhile() {
        int maxFloors = 163;
        int currentFloor = 0;

        int count = 0;

        do {
            currentFloor = currentFloor + 5 - 1;
            count++;
        } while (currentFloor <= maxFloors);

        System.out.println("Number of iterations is " + count);
    }
}
