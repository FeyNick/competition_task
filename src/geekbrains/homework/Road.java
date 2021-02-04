package geekbrains.homework;

public class Road {
    private int length;

    public void overcome(String name, int ability) {
        if (Main.pass) {
            if (ability < length) {
                System.out.println(name + " не добежал");
                System.out.println();
                Main.pass = false;
            } else {
                System.out.println(name + " пробежал!");
                System.out.println();
            }
        } else
            System.out.println(name + " выбыл");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
