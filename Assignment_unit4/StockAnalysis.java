import java.util.ArrayList;

public class StockAnalysis {

    // Method to calculate the average stock price
    public static double calculateAveragePrice(int[] stockPrices) {
        double sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to find the maximum stock price
    public static int findMaximumPrice(int[] stockPrices) {
        int maxPrice = stockPrices[0];
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to determine the occurrence count of a specific price
    public static int countOccurrences(int[] stockPrices, int targetPrice) {
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stockPricesList) {
        ArrayList<Integer> cumulativeSumList = new ArrayList<>();
        int sum = 0;
        for (int price : stockPricesList) {
            sum += price;
            cumulativeSumList.add(sum);
        }
        return cumulativeSumList;
    }

    public static void main(String[] args) {
        // Example input
        int[] stockPrices = {100, 200, 150, 300, 250, 100, 200, 150, 300, 250};
        ArrayList<Integer> stockPricesList = new ArrayList<>();
        for (int price : stockPrices) {
            stockPricesList.add(price);
        }

        // Calculate and display the average stock price
        double averagePrice = calculateAveragePrice(stockPrices);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find and display the maximum stock price
        int maxPrice = findMaximumPrice(stockPrices);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Determine and display the occurrence count of a specific price
        int targetPrice = 200;
        int occurrences = countOccurrences(stockPrices, targetPrice);
        System.out.println("Occurrences of Price " + targetPrice + ": " + occurrences);

        // Compute and display the cumulative sum of stock prices
        ArrayList<Integer> cumulativeSumList = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSumList);
    }
}
