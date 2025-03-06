package Exercise1;

public class Dog extends Mammal {

    @Override
    public String toString() {
        return super.toString();
    }

    public String greets() {
        return "woof";
    }

    public String greets(Dog anotherDog) {
        return "woooooooooof";
    }
}
