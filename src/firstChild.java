public class firstChild extends Parent implements Printable{
    private int age;

    public firstChild(String name, int age) {
        super(name);
        this.age = age;
    }


    @Override
    public void print() {
        System.out.println("first child" +
                "\nName: " + getName() +
                "\nAge: " + age);
    }
}
