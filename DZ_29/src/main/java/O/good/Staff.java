package O.good;

class Staff implements Weapon {
    @Override
    public void attack(int damage) {
        System.out.println("Посох нанес " + damage + " магического урона");
    }
}
