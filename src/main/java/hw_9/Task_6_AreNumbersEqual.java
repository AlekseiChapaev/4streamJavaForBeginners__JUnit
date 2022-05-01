package hw_9;

public class Task_6_AreNumbersEqual {

    public int AreNumbersEqual(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 > num2) {
            return 1;
        } else {
            return -1;
        }
    }
}
