package Factory.FactoryMethod;

public abstract class Unit {

    private int hp;
    private int exp;
    private int dmg;

     Unit(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmg() {
        return dmg;
    }
}
