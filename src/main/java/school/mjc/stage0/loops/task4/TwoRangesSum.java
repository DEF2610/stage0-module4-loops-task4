package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow)
            System.out.println("number to skip is bugger then the last");
        else if (lastInRow < 0)
            System.out.println("last number in row is negative");
        else {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip)
                    sum1 += i;
                sum2 += i;
            }
            System.out.println("skipped sum is " + sum1 + "\ncounted sum is " + (sum2 - sum1));
        }
    }
}
