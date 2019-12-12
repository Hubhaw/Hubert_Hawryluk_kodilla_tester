public class FirstClass {
    public static void main(String[] args) {



        Notebook notebook = new Notebook(600, 1520, 2019);
        System.out.println(notebook.weight+"g"+" "+notebook.price+"$"+" "+notebook.year+"r.");
        notebook.checkWeight();
        notebook.priceAndYearComparison();

        Notebook oldNotebook = new Notebook(1500, 499,2001);
        System.out.println(oldNotebook.weight+"g"+" "+oldNotebook.price+"$"+" "+oldNotebook.year+"r.");
        oldNotebook.checkWeight();
        oldNotebook.priceAndYearComparison();

        Notebook heavyNotebook = new Notebook(2600,760, 2015);
        System.out.println(heavyNotebook.weight+"g"+" "+heavyNotebook.price+"$"+" "+heavyNotebook.year+"r.");
        heavyNotebook.checkWeight();
        heavyNotebook.priceAndYearComparison();

        LeapYear leapYear = new LeapYear(2057);
        System.out.println("Czy "+ leapYear.year +" rok jest przestępny:"+" "+leapYear.isLeapYear());
    }
}