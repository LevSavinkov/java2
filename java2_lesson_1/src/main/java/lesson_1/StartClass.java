package lesson_1;

public class StartClass {
    public static void main(String[] args) {

        Human human2 = new Human(10, 5, "Андрей");

        Participants[] participants = {
               human2
        };

        Obstacles[] obstacles = {
                new Wall(10)
        };

        for (Participants i : participants) {
            for (Obstacles j : obstacles){
                if (j instanceof Wall) {
                    if (j.wallHeight > i.jumpLimit){
                        i.notRun;
                    }
                }
                }
            }
        }
    }



