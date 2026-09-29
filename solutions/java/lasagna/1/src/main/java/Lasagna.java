public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutes = 40;
    public int expectedMinutesInOven() {
        return expectedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    int remains;
    public int remainingMinutesInOven(int x) {
        remains = expectedMinutes - x;
        return remains;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    int TimeTaken;
    public int preparationTimeInMinutes(int y) {
        TimeTaken = y*2;
        return TimeTaken;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    int totalTime;
    public int totalTimeInMinutes(int a, int b) {
        totalTime = preparationTimeInMinutes(a) + (40 - remainingMinutesInOven(b));
        return totalTime;
    }
}
