package lab2.registration.model;

/**
 * Класс для базовой информации о человеке
 */
public class Person {

    /**
     * идентификатор человека
     */
    protected int id;

    /**
     * ФИО человека
     */
    protected String name;

    // геттеры и сеттеры
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
