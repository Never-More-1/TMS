package O.bad;

class Character {
    String weaponName;
    int damage;
    public Character(String weaponName, int damage){
        this.weaponName = weaponName;
        this.damage = damage;
    }
    public void attack() {
        if (this.weaponName.equals("Меч")) {
            System.out.println("Меч нанес " + damage + " урона");
        }
        if (this.weaponName.equals("Лук")) {
            System.out.println("Лук нанес " + damage + " урона");
        }
        if (this.weaponName.equals("Посох")) {
            System.out.println("Посох нанес " + damage + " урона");
        }
    }
}
//Этот код не соответствует принципу открытости/закрытости, т.к. для добавления
//другого вида оружия требуется изменять уже существующий код.
//Классы должны быть открыты для расширения, но закрыты для модификации.
