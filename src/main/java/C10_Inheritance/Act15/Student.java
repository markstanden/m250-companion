package C10_Inheritance.Act15;

public class Student extends Person {
    private int id;

    public Student(final int id, final String name) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void printStudent() {
        System.out.print(String.format("Student called %s with id %d", super.getName(), id));
    }
}
