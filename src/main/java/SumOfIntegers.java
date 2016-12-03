/**
 * Created by saoprb on 12/3/2016.
 */
public class SumOfIntegers {

    public Integer sumOfIntegers(Integer integerToSumUp) {
        if (null == integerToSumUp) {
            throw new IllegalArgumentException("Parameter integerToSumUp cannot be null.");
        }

        Integer sumTotal = 0;
        for (Integer integerStep = 0; integerStep < integerToSumUp; integerStep++) {
            sumTotal += integerStep;
        }
        return sumTotal;
    }

    public void printSumOfIntegers(Integer integerToSumUp) {
        System.out.format("Total sum of integer %s is %s%n", integerToSumUp, sumOfIntegers(integerToSumUp));
    }

    public static void main(String[] args) {
        SumOfIntegers sumOfIntegers = new SumOfIntegers();

        Integer five = 5;
        sumOfIntegers.printSumOfIntegers(five);
        /*
        sumTotal = 0 + 0, integerStep = 0
        sumTotal = 0 + 1, integerStep = 1
        sumTotal = 1 + 2, integerStep = 2
        sumTotal = 3 + 3, integerStep = 3
        sumTotal = 6 + 4, integerStep = 4
        sumTotal = 10
         */
    }
}
