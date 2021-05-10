package lesson_1;

public class StartClass {
    public static void main(String[] args) {

        Participants[] participants = {
                new Human(21, 10, "Петр"),
                new Cat(24, 15, "Васька"),
                new Robo(5, 5, "Немощь")
        };

        Obstacles[] obstacles = {
                new Wall(0, 1),
                new Road(1, 0),
                new Wall(0,23),
                new Road(16, 0)
        };


        for (Participants p : participants) {
            for (Obstacles o : obstacles) {
                if (o.getRoadLength() == 0) {
                    if (p.jump(o.getWallHeight()) == true) {
                        System.out.println(p.getName() + " перепрыгнул!");
                    } else {
                        break;
                    }
                } else {
                    if (p.run(o.getRoadLength()) == true){
                        System.out.println(p.getName() + " пробежал!");
                    } else {
                        break;
                    }
                }
            }
        }


    }
}



