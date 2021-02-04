package geekbrains.homework;

public class Main {
    public static boolean pass = true;

    public static void main(String[] args) {

        Human[] humans = new Human[3];
        Robot[] robots = new Robot[3];
        Cat[] cats = new Cat[3];

        for (int i = 0; i < 3; i++) {
            humans[i] = new Human();
            robots[i] = new Robot();
            cats[i] = new Cat();
        }

        Wall[] walls = new Wall[5];
        Road[] roads = new Road[5];

        for (int i = 0; i < 5; i++) {
            walls[i] = new Wall();
            roads[i] = new Road();
        }

        humans[0].setName("Витя");
        humans[1].setName("Вова");
        humans[2].setName("Костя");

        robots[0].setName("Электроник");
        robots[1].setName("Железяка");
        robots[2].setName("Вертер");

        cats[0].setName("Барсик");
        cats[1].setName("Мурзик");
        cats[2].setName("Пушок");

        int run = 100;
        int jump = 2;
        for (int i = 0; i < 3; i++) {
            humans[i].setRunning(run);
            humans[i].setJumping(jump);
            run += 40;
            jump += 1;
        }

        run = 300;
        jump = 5;
        for (int i = 0; i < 3; i++) {
            robots[i].setRunning(run);
            robots[i].setJumping(jump);
            run += 100;
            jump += 4;
        }

        run = 10;
        jump = 1;
        for (int i = 0; i < 3; i++) {
            cats[i].setRunning(run);
            cats[i].setJumping(jump);
            run += 15;
            jump += 1;
        }

        int n = 10;
        for (int i = 0; i < 5; i++) {
            roads[i].setLength(n);
            n += 100;
        }

        n = 1;
        for (int i = 0; i < 5; i++) {
            walls[i].setLength(n);
            n += 2;
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 5; i++) {
                if (pass) {
                    roads[i].overcome(humans[k].getName(), humans[k].getRunning());
                    walls[i].overcome(humans[k].getName(), humans[k].getJumping());
                }
                if (i == 4) {
                    if (pass) {
                        System.out.println(humans[k].getName() + " преодолел все препятствия");
                        System.out.println();
                    }
                    pass = true;
                }
            }
        }


        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 5; i++) {
                if (pass) {
                    roads[i].overcome(robots[k].getName(), robots[k].getRunning());
                    walls[i].overcome(robots[k].getName(), robots[k].getJumping());
                }
                if (i == 4) {
                    if (pass) {
                        System.out.println(robots[k].getName() + " преодолел все препятствия");
                        System.out.println();
                    }
                    pass = true;
                }
            }
        }


        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 5; i++) {
                if (pass) {
                    roads[i].overcome(cats[k].getName(), cats[k].getRunning());
                    walls[i].overcome(cats[k].getName(), cats[k].getJumping());
                }
                if (i == 4) {
                    if (pass) {
                        System.out.println(cats[k].getName() + " преодолел все препятствия");
                        System.out.println();
                    }
                    pass = true;
                }
            }
        }

    }

}
