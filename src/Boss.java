public class Boss extends GameEntity {
    private Weapon weapon;
    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss name: " + getName() + "\thealth: " + getHealth() + "\tdamage: " + getDamage() + "\tweapon name: " + getWeapon().getName() + "\tweapon type: " + getWeapon().getType();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
