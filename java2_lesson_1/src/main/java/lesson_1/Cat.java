package lesson_1;

public class Cat implements Running, Jumping {
    @Override
    public void Run() {
        System.out.println("Кот бежит!");
    }

    @Override
    public void notRun() {

    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает!");
    }

    @Override
    public void notJump() {

    }
}
