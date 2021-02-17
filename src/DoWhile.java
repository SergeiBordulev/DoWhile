public class DoWhile {
    public static void main(String[] args) {
        int startNumber = 5;
        int endNumber = 17;

        int numbersCount = 0;
        int numbersSum = 0;
        int i = startNumber;

        while (i <= endNumber) {
            numbersSum += i;
            i++;
            numbersCount++;
        }

        double allNumbersAverage = (double)numbersSum / numbersCount;
        System.out.println("Arithmetic mean: " + allNumbersAverage);

        // Поиск среднего значения через DoWhile

        int startNumberWithDoWhile = 14;
        int endNumberWithDoWhile = 17;

        int numbersCountWithDoWhile = 0;
        int numbersSumWithDoWhile = 0;
        int j = startNumberWithDoWhile;

        do {
            numbersSumWithDoWhile += j;
            j++;
            numbersCountWithDoWhile++;
        } while (j <= endNumberWithDoWhile);

        double allNumbersAverageWithDoWhile = (double)numbersSumWithDoWhile / numbersCountWithDoWhile;
        System.out.println("Arithmetic mean: " + allNumbersAverageWithDoWhile + " (using Do-While)");

        System.out.println();

        int startEvenNumber = 5;
        int endEvenNumber = 63;

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;
        int k = startEvenNumber;

        while (k <= endEvenNumber) {
            if (k % 2 == 0) {
                evenNumbersSum += k;
                evenNumbersCount++;
            }

            k++;
        }

        double evenNumbersAverage = (double)evenNumbersSum / evenNumbersCount;
        System.out.println("The arithmetic average of the even values of: " + evenNumbersAverage);

        int startEvenNumberWithDoWhile = 5;
        int endEvenNumberWithDoWhile = 17;

        int evenNumbersSumWithDoWhile = 0;
        int evenNumbersCountWithDoWhile = 0;
        int m = startEvenNumberWithDoWhile;

        do {
            if (m % 2 == 0) {
                evenNumbersSumWithDoWhile += m;
                evenNumbersCountWithDoWhile++;
            }

            m++;
        } while (m <= endEvenNumberWithDoWhile);

        double evenNumbersAverageWithDoWhile = (double)evenNumbersSumWithDoWhile / evenNumbersCountWithDoWhile;
        System.out.println("The arithmetic average of the even values of: " + evenNumbersAverageWithDoWhile + " (using Do-While)");
    }
}
