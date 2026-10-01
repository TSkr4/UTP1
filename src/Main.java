// TODO: musimy dodac brakujace klasy!
// Ok, ja dodam Adder a s33475 doda Subtractor

public class Main {
    static void main() {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(6,3));
    }
}
