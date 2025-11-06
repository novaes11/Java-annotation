package SistemaDeEscola;

public abstract class Person {
    protected String name;
    protected int age;
    protected String email;
    public Person(String name, int age, String email) {
        if (age < 0 || age > 120) throw new IllegalArgumentException("Invalid age! Age can't be negative or bigger then 120.");
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public abstract String getName();
    public abstract Person setName(String name);

    public abstract int getAge();
    public abstract Person setAge(int age);
    public abstract String getEmail();
    public abstract Person setEmail(String email);
    public abstract String getRoleDescription();
    public abstract String getUniqueIdentifier();
}
