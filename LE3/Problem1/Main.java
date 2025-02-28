
/*abstract class Bharatvanshi {
    protected String name;

    public Bharatvanshi(String name) {
        this.name = name;
    }

    
    public abstract void fight();

    
    public boolean isFighter() {
        return true;
    }
}


class Pandav extends Bharatvanshi {
    protected int obedience;  
    protected int kindness;   

    public Pandav(String name, int obedience, int kindness) {
        super(name);
        this.obedience = obedience;
        this.kindness = kindness;
    }

    @Override
    public void fight() {
        System.out.println(this.name + " is fighting valiantly!");
    }

    public void obey() {
        if (obedience > 5) {
            System.out.println(this.name + " is obeying orders.");
        } else {
            System.out.println(this.name + " is not obeying properly.");
        }
    }

    public void kind() {
        if (kindness > 5) {
            System.out.println(this.name + " is kind.");
        } else {
            System.out.println(this.name + " is less kind.");
        }
    }
}


class Kaurav extends Bharatvanshi {
    protected int obedience;  
    protected int cruelty;   
    protected int kindness;   

    public Kaurav(String name, int obedience, int cruelty, int kindness) {
        super(name);
        this.obedience = obedience;
        this.cruelty = cruelty;
        this.kindness = kindness;
    }

    @Override
    public void fight() {
        System.out.println(this.name + " is fighting ruthlessly!");
    }

    public void obey() {
        if (obedience > 5) {
            System.out.println(this.name + " is obeying orders.");
        } else {
            System.out.println(this.name + " is disobeying.");
        }
    }

    public void kind() {
        if (kindness > 5) {
            System.out.println(this.name + " is kind.");
        } else {
            System.out.println(this.name + " is cruel.");
        }
    }
}


class Arjun extends Pandav {
    public Arjun() {
        super("Arjun", 10, 10);
    }
}


class Bheem extends Pandav {
    public Bheem() {
        super("Bheem", 10, 3); 
    }
}


class Duryodhan extends Kaurav {
    public Duryodhan() {
        super("Duryodhan", 2, 10, 0); 
    }
}


class Vikarn extends Kaurav {
    public Vikarn() {
        super("Vikarn", 8, 2, 8); 
    }
}
*/


public class Main {
    public static void test() {
        // Pandavs
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Kauravs
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }

    public static void main(String[] args) {
        test();
    }
}
