public class FirstClass {

    public int[] ascendingSequence(int start, int end, int step) {
        if (step >= 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];
            int j = 0;
            for (int i = start; i <= end; i += step) {
                if (j < result.length) {
                    result[j] = i;
                    j++;
                }
            }

            return result;
        }
            return new int[]{};
    }
}