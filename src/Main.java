public abstract class Main {

    public static void main(String[] args) {
        Jason jj = new Jason();
        jj.firstMethod();//this example uses the first method which is called in Abomination class which then points to that method in
        //Frannie class which also calls method three to print Third
        jj.secondMethod();//this moves onto method 2 which prints Second, and then asks to reprint first method again, hence First reprinted
        jj.thirdMethod();//third method is invoked in both Jason class and also in Frannie class which prints Third twice



        //prints First, Third, Second, First, Third, Third




    }
}
