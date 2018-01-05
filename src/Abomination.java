public abstract class Abomination extends Main {
    abstract void firstMethod();

    void secondMethod() {
        System.out.println("Second");
        firstMethod();

    }
}
