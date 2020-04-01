package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class Child extends  Parent {

    public int childData = 42;
    public Child() {
        System.out
                .println("Child constructor");
    }
    @Override
    public void showInfo() {
        System.out
                .println("childData:"
                        + childData);
    }
}
