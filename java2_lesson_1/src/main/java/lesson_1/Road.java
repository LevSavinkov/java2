package lesson_1;

public class Road implements Obstacles{
    int roadLength;

    public Road(int roadLength) {
        this.roadLength = roadLength;
    }

    void run (String name, int a) {
        if (a < roadLength) {
            System.out.println(name + " не пробежал!");
        } else {
            System.out.println(name + " пробежал!");
        }
    }
}
