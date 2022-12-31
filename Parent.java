public class Parent {
    private String firstName;
    private String lastName;
    private Integer idPerson;

    public Parent(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPerson = idPerson;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo() {
        System.out.println(printString());
    }

    public String listOfChildren() {
        return "Детей нет";
    }

    private String printString() {
        return "GeoTree{" + '\'' +
                "firstName'" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idPerson=" + idPerson + ',' +
                listOfChildren() +
                '}';
    }
}