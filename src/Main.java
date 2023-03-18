public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon("Morgenstern",WeaponType.MELEE_WEAPONS);
        Boss boss = new Boss("Evil",1400,100,bossWeapon);

        Weapon skeletonWeapon = new Weapon("Bow",WeaponType.RANGED_WEAPONS);
        Skeleton skeleton = new Skeleton("000", 50,5,skeletonWeapon,7);
        Skeleton skeleton1 = new Skeleton("001",50,5,skeletonWeapon,5);
        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());
    }
}