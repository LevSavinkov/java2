package lesson_1;

public class Wall implements Obstacles {

    int roadLength;
    int wallHeight;

    public Wall(int roadLength, int wallHeight) {
        this.roadLength = roadLength;
        this.wallHeight = wallHeight;
    }

    @Override
    public int getWallHeight() {
        return this.wallHeight;
    }

    @Override
    public int getRoadLength() {
        return this.roadLength;
    }
}
