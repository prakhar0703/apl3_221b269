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