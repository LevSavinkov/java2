package lesson_1;

public class Human implements Running, Jumping, Participants {
    private int jumpLimit;
    private int runLimit;
    private String name;

    public Human(int jumpLimit, int runLimit, String name) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.name = name;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Run() {
        System.out.println(name + " пробегает!");
    }

    @Override
    public void notRun() {
        System.out.println(name + " не пробегает!");
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгивает!");
    }

    @Override
    public void notJump() {
        System.out.println(name + " не перепрыгивает!");
    }
}
