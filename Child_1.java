import java.util.Arrays;

public class Child_1 extends Parent {

    String[] child = { "Петрова Дарья", "Петров Владимир" };
    String child1 = Arrays.toString(child);

    public Child_1(String firstName, String lastName, Integer idPerson) {
        super(firstName, lastName, idPerson);
        setIdPerson(2);
        getIdPerson();
    }

    @Override
    public String listOfChildren() {
        return "Дети: " + child1;
    }

}
