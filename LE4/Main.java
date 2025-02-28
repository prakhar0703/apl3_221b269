public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getinstance();
        System.out.println("Instance 1 count: " + s1.count);

        Singleton s2 = Singleton.getinstance();
        System.out.println("Instance 2 count: " + s2.count); 

        Singleton s3 = Singleton.getinstance();
        System.out.println("Instance 3 count: " + s3.count);
       

        Singleton s4 = Singleton.getinstance();
        System.out.println("Instance 4 count: " + s4.count);
    }
}