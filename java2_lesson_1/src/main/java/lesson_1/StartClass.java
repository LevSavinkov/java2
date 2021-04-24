package lesson_1;

public class StartClass {
    public static void main(String[] args) {

        Participants[] participants = {
                new Human(21, 10, "Петр"),
                new Cat(24, 15, "Васька"),
                new Robo(5, 5, "Немощь")
        };

        Obstacles[] obstacles = {
                new Wall(20, 0),
                new Road(0, 7),
                new Wall(23, 0),
                new Road(0, 16)
        };


        for (Participants p : participants) {
            for (Obstacles o : obstacles) {
                if (o.roadLength == 0) {
                    if (p.jump(o.wallHeight) == true) {
                        System.out.println(p.getName() + " перепрыгнул!");
                    } else {
                        break;
                    }
                } else {
                    if (p.run(o.roadLength) == true){
                        System.out.println(p.getName() + " пробежал!");
                    } else {
                        break;
                    }
                }
            }
        }


    }
}



