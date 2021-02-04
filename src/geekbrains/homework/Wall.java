package geekbrains.homework;

public class Wall {
    private int length;

    public void overcome(String name, int ability) {
        if (Main.pass) {
            if (ability < length) {
                System.out.println(name + " не перепрыгнул");
                System.out.println();
                Main.pass = false;
            } else {
                System.out.println(name + " перепрыгнул!");
                System.out.println();
            }
        } else
            System.out.println(name + " выбыл");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
