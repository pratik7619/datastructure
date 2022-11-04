package ideas;

public class MinimalAverage {
    //?Pratik Sherdiwala (Codelytics)

    static void findMinimalAverage(
            double buyPrice,
            int currentQuantity,
            double currentPrice
    ) {
        double totalAmount = buyPrice * currentQuantity;
        currentQuantity += 25;
        double updatedAveragePrice = (totalAmount + addQuantity(currentPrice)) / currentQuantity;

        if (currentPrice != Math.floor(updatedAveragePrice)) {
            findMinimalAverage(
                    updatedAveragePrice,
                    currentQuantity,
                    currentPrice
            );
        } else {
            System.out.println("You need to add total " + (currentQuantity / 25) + " lots\nTotal quantity " + (currentQuantity));
        }
    }

    static double addQuantity(double price) {
        return price * 25;
    }

    public static void main(String[] args) {
        findMinimalAverage(
                200,
                100,
                120
        );
    }
}
