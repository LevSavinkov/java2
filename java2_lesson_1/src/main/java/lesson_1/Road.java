package lesson_1;

public class Road implements Obstacles {

    int roadLength;
    int wallHeight;

    public Road(int roadLength, int wallHeight) {
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

    //    public Road(int wallHeight, int roadLength) {
//        super(wallHeight, roadLength);
//    }
}
