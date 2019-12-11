public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if(this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if(this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if(this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if(this.weight > 600 && this.weight < 1500) {
            System.out.println("The weight of this notebook is standard.");
        } else {
            System.out.println("This notebook is heavy!");
        }
    }
    public void priceAndYearComparison(){
        if(this.price < 1000 && this.year > 2016) {
            System.out.println("This notebook is new and price is good!");
        } else if(this.price > 1000 && this.year > 2016){
            System.out.println("This notebook is quite new but price is awful!");
        } else if(this.price < 100 && this.year<2010) {
            System.out.println("This notebook is rather old but for a good price!");
        } else {
            System.out.println("This notebook is old and too expensive compared to it's year of production");
        }
    }

}
