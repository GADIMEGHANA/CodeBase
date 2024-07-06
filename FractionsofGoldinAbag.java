import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class GoldSample {
    double weight;
    double value;
    double valuePerWeight;

    GoldSample(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.valuePerWeight = value / weight;
    }
}

public class FractionsofGoldinAbag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and W
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        GoldSample[] samples = new GoldSample[N];

        // Read the samples
        for (int i = 0; i < N; i++) {
            double weight = scanner.nextDouble();
            double value = scanner.nextDouble();
            samples[i] = new GoldSample(weight, value);
        }

        // Sort the samples by value-to-weight ratio in descending order
        Arrays.sort(samples, new Comparator<GoldSample>() {
            @Override
            public int compare(GoldSample o1, GoldSample o2) {
                return Double.compare(o2.valuePerWeight, o1.valuePerWeight);
            }
        });

        double totalValue = 0.0;
        double remainingWeight = W;

        for (GoldSample sample : samples) {
            if (remainingWeight <= 0) {
                break;
            }

            if (sample.weight <= remainingWeight) {
                // Take the whole sample
                totalValue += sample.value;
                remainingWeight -= sample.weight;
            } else {
                // Take as much as possible from the current sample
                totalValue += sample.valuePerWeight * remainingWeight;
                remainingWeight = 0;
            }
        }

        // If the bag is not exactly filled, print -1
        if (remainingWeight > 0) {
            System.out.println("-1");
        } else {
            // Print the result with precision
            System.out.printf("%.12f%n", totalValue);
        }

        scanner.close();
    }
}
