class RedHeadDuck implements Swim, Fly, Quack {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }
}