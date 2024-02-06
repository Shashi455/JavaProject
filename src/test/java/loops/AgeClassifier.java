package loops;

public class AgeClassifier {
    public static void main(String[] args) {
        printPersonType(8);
        printPersonType(16);
        printPersonType(25);
    }

    public static void printPersonType(int age) {
        if (age < 13) {
            System.out.println("kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("teen");
        } else {
            System.out.println("adult");
        }
    }
}
