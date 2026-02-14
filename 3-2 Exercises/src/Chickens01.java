public class Chickens01 {
    public static void main(String[] args) {
        countEggs(5,3);
        countEggs(4,8);
    }

    public static void countEggs(int eggsPerChicken, int chickenCount){
        int totalEggs = 0;

        // Monday
        totalEggs = eggsPerChicken * chickenCount;

        // Tuesday
        chickenCount++;
        totalEggs += (chickenCount * eggsPerChicken);

        // Wednesday
        chickenCount /= 2;
        totalEggs += (chickenCount * eggsPerChicken);

        System.out.println(totalEggs);
    }
}
