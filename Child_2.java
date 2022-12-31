import java.util.Arrays;

public class Child_2 extends Parent {

    String[] child = { "Иванов Олег", "Иванов Владимир", "Иванова Ольга" };
    String child2 = Arrays.toString(child);

    public Child_2(String firstName, String lastName, Integer idPerson) {
        super(firstName, lastName, idPerson);
        setIdPerson(1);
        getIdPerson();
    }

    @Override
    public String listOfChildren() {
        return "Дети: " + child2;
    }

}
