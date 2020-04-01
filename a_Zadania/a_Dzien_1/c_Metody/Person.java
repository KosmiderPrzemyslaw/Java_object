package a_Zadania.a_Dzien_1.c_Metody;

public class Person {
    private String name = "name";
    private String surname = "surname";
    private int age = 19;
    private char gender = 'M';

    public String toString() {
        return "Person{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", age: '" + age + '\'' +
                ", gender: '" + gender + '\'';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    public String getFullName(String name, String surname) {
        return this.name + " " + this.surname;
    }

    public int increaseAge(int age) {
        return this.age++;
    }

}
