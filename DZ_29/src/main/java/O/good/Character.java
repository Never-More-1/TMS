package O.good;

public class Character {
    private Weapon weapon;
    private int damage;

    public Character(Weapon weapon, int damage) {
        this.weapon = weapon;
        this.damage = damage;
    }

    public void attack() {
        weapon.attack(damage);
    }

    public void changeWeapon(Weapon newWeapon, int damage) {
        this.weapon = newWeapon;
        this.damage = damage;
    }
}
//Этот код соответствует принципу открытости/закрытости, т.к. для добавления
//другого вида оружия и изменения урона от него не требуется изменять уже существующий код.
//Теперь будет достаточно лишь создать новый класс с типом оружия.