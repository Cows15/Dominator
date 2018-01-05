public abstract class Frannie extends Abomination {
    @Override
    void firstMethod() {
        System.out.println("First");
        thirdMethod();
    }
    abstract void thirdMethod();


}
