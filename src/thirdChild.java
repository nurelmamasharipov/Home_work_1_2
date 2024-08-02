public class thirdChild extends Parent implements Printable{
    private double height;

    public thirdChild(String name, double height) {
        super(name);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("third child " +
                "\nName: " + getName() +
                "\nheight: " + height);
    }
}
