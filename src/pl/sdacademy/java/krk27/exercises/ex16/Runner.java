package pl.sdacademy.java.krk27.exercises.ex16;

public enum Runner {
    BEGINNER(180, Integer.MAX_VALUE),
    INTERMEDIATE(120, 180),
    ADVANCED(0, 120);

    private int runTimeMin;
    private int runTimeMax;

    Runner(int runTimeMin, int runTimeMax) {
        this.runTimeMin = runTimeMin;
        this.runTimeMax = runTimeMax;
    }

    public int getRunTimeMin() {
        return runTimeMin;
    }

    public int getRunTimeMax() {
        return runTimeMax;
    }

    public static Runner getFitnessLevel(int time) {
        if (time <= ADVANCED.getRunTimeMax()) {
            return ADVANCED;
        }
        if (time <= INTERMEDIATE.getRunTimeMax()) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }

}
