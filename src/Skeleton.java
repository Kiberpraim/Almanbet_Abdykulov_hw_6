public class Skeleton extends Boss {
    private int numberOfArrows;
    public Skeleton(String name, int health, int damage, Weapon weapon, int numberOfArrows) {
        super(name, health, damage, weapon);
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo(){
        return "Skeleton_" + getName() + "\thealth: " + getHealth() + "    \tdamage: " + getDamage() + "\tweapon name: " + getWeapon().getName() + "        \tweapon type: " + getWeapon().getType() + "\tNumber of arrows: " + getNumberOfArrows();
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
}
