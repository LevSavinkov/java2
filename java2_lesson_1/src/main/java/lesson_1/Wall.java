package lesson_1;

public class Wall implements Obstacles {
    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    int wallHeight;

    public int getWallHeight() {
        return wallHeight;
    }

    void jump(String name, int a) {
        if (a < wallHeight) {
            System.out.println(name + " не перепрыгнул!");
        } else {
            System.out.println(name + " перепрыгнул!");
        }
    }
}
