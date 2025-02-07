class RubberDuck implements Swim, Squeak {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}