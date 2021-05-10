package lesson_1;

public class Robo implements Participants{
    private final int jumpLimit;
    private final int runLimit;
    private final String name;

    public Robo (int jumpLimit, int runLimit, String name) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean jump(int height) {
        return jumpLimit > height;
    }
    public boolean run(int length) {
        return runLimit > length;
    }
}
