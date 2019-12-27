package bsu.rfe.group9.lab1.Padhaiski.varB1;

public class honey extends Food {


    public honey(String name) {
        super(name);
    }

    @Override
    public void consume() {
        System.out.println("Мёд съеден; в нём содержится " + this.calculateCalories() + " калорий");
    }

    @Override
    public int calculateCalories() {
        return 0;
    }
}
