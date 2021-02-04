package geekbrains.homework;

public class Robot {
    private String name;
    private int running;
    private int jumping;

    public void setRunning(int running) {
        this.running = running;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }
    public int getRunning() {
        return running;
    }

    public int getJumping() {
        return jumping;
    }
    public void setName(String name) {
        this.name = "Робот " + name;
    }

    public void jump() {
        System.out.println(name + " прыгает");
        System.out.println();
    }

    public void run() {
        System.out.println(name + " бежит");
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
