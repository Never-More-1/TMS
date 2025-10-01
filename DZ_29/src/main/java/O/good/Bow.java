package O.good;

class Bow implements Weapon {
    @Override
    public void attack(int damage) {
        System.out.println("Лук нанес " + damage + " урона");
    }
}
