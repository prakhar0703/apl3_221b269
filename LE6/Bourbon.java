class Bourbon extends Decorator{
    Bourbon(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName() + " with Bourbon";
    }
    int getPrice(){
        return offering.getPrice() + 55;
    }
}