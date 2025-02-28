public class Singleton{
    private static Singleton UniqueInstance;
    static int count = 0;
    private Singleton(){
        
    }
    public static Singleton getinstance(){
        if(UniqueInstance == null){
            UniqueInstance = new Singleton();
            count++;
            return UniqueInstance;
        }
        return UniqueInstance;
    }
}