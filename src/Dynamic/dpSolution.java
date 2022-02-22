package Dynamic;

public class dpSolution {

    static int getValue(int[] values, int rodLength) {
        int[] subSolutions = new int[rodLength + 1];

        for (int i = 1; i <= rodLength; i++) {
            int tmpMax = -1;
            for (int j = 0; j < i; j++) {
                tmpMax = Math.max(tmpMax, values[j] + subSolutions[i - j - 1]);
                System.out.println("subSolutions[i - j - 1]: " + subSolutions[i - j - 1]);
                System.out.println("[j]: " + j);
                System.out.println("values[j]: " + values[j]);
                System.out.println("tmpMax: " + tmpMax);
            }
            subSolutions[i] = tmpMax;
        }
        return subSolutions[rodLength];
    }

    public static void main(String[] args) {
        int[] values = new int[]{3, 7, 1, 3, 9};
        int rodLength = values.length;

        System.out.println("Max rod value: " + getValue(values, rodLength));
    }
}