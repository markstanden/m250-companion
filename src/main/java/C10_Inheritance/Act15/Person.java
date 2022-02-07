package C10_Inheritance.Act15;

public class Person {
    private String name;

    public Person(final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printPerson(){
        System.out.println("Person called ".concat(name));
    }
}
