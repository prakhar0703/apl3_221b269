class Main{
    public static void main (String[] args) {
        Offering offering = new IceCream();
        offering = new Bourbon(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}