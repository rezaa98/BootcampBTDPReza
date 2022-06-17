package Manusia;

public class Bangjago {
    public static void main(String[] args) {
        Manusia cowok = new Cowok();
        cowok.nyanyiLaguGes();

        Manusia cewek = new Cewek();
        cewek.nyanyiLaguGes();
    }
}

abstract class Manusia {
    protected abstract void nyanyiLaguGes();
}

class Cowok extends Manusia {
    @Override
    protected void nyanyiLaguGes() {
        System.out.println("Boy Sing, Yu me naraba dorehodo");
    }
}

class Cewek extends Manusia {
    @Override
    protected void nyanyiLaguGes() {
        System.out.println("Girl Sing, ketika mimpimuuuuu tak begitu indah");
    }
}