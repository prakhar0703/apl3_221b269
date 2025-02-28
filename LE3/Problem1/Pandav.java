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
