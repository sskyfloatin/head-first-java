public class GoodDog2 {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav Gav");
        } else if (size > 14) {
            System.out.println("Voof voof");
        } else {
            System.out.println("Tiaf tiaf");
        }
    }
}
