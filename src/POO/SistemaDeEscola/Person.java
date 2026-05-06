package src.POO.SistemaDeEscola;

/**
 * Classe abstrata que representa uma pessoa no sistema escolar.
 * Define os atributos e comportamentos comuns a todos os indivíduos,
 * como nome, idade e e-mail.
 */
public abstract class Person {
    protected String name;
    protected int age;
    protected String email;

    /**
     * Construtor da classe Person.
     *
     * @param name  O nome da pessoa.
     * @param age   A idade da pessoa.
     * @param email O endereço de e-mail da pessoa.
     * @throws IllegalArgumentException Se a idade for inválida.
     */
    public Person(String name, int age, String email) {
        if (age < 0 || age > 120) throw new IllegalArgumentException("Invalid age! Age can't be negative or bigger then 120.");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    /**
     * Obtém o nome da pessoa.
     * @return O nome.
     */
    public abstract String getName();

    /**
     * Define o nome da pessoa.
     * @param name O novo nome.
     * @return A própria instância da pessoa.
     */
    public abstract Person setName(String name);

    /**
     * Obtém a idade da pessoa.
     * @return A idade.
     */
    public abstract int getAge();

    /**
     * Define a idade da pessoa.
     * @param age A nova idade.
     * @return A própria instância da pessoa.
     */
    public abstract Person setAge(int age);

    /**
     * Obtém o e-mail da pessoa.
     * @return O e-mail.
     */
    public abstract String getEmail();

    /**
     * Define o e-mail da pessoa.
     * @param email O novo e-mail.
     * @return A própria instância da pessoa.
     */
    public abstract Person setEmail(String email);

    /**
     * Obtém a descrição do papel da pessoa na escola.
     * @return A descrição do papel.
     */
    public abstract String getRoleDescription();

    /**
     * Obtém um identificador único para a pessoa.
     * @return O identificador único.
     */
    public abstract String getUniqueIdentifier();
}
