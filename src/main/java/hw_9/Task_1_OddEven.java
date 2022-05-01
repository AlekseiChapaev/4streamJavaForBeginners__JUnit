package hw_9;

public class Task_1_OddEven {

    public String isNumberOdd(long number) {
        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        } else {
            return "Undefined";
        }
    }
}
