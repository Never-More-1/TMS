package O.good;

class Sword implements Weapon {
    @Override
    public void attack(int damage) {
        System.out.println("Меч нанес " + damage + " урона");
    }
}