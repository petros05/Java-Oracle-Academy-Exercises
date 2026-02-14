public class Chickens02 {
    public static void main(String[] args) {
        int totalEggs = 0;

        // Assign variables
        double dailyAverage = 0;
        double monthlyAverage = 0;
        double monthlyProfit = 0;

        // Monday
        totalEggs = 100;

        // Tuesday
        totalEggs += 121;

        // Wednesday
        totalEggs += 117;

        // Calculate dailyAverage
        dailyAverage = totalEggs / 3.0;

        // Calculate monthlyAverage
        monthlyAverage = dailyAverage * 30;

        // Calculate monthlyProfit
        monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   "  + dailyAverage);
        System.out.println("Monthly Average: "  + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }

}