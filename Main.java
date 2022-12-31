public class Main {
    public static void main(String[] args) {
        Parent patrushev = new Parent("Патрушев", "Иван", 3);
        patrushev.printInfo();
        Child_1 petrova = new Child_1("Петрова", "Мария", 2);
        petrova.printInfo();
        Child_2 ivanov = new Child_2("Иванов", "Станислав", 1);
        ivanov.printInfo();

    }
}
