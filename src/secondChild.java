public class secondChild extends Parent implements Printable{
    private String hobby;

    public secondChild(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println("second child " +
                "\nName: " + getName() +
                "\nhobby: " + hobby);
    }
}
