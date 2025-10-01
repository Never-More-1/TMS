package S.bad;

public class Employee {
    String employeeId;
    int money;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void employeeRepository(Employee employee){
        System.out.println("Сотрудник " + employeeId + " добавлен в реестр");
    }

    public void salaryRepository(Employee employee) {
        System.out.println("Сотрудник " + employeeId + " получил зарплату: " + money);
    }
}
//Этот код не соответствует принципу единственной ответственности,
// т.к. в одном классе находятся и сеттеры, и логика для добавления в реестр сотрудника,
// и логика для вывода зарплаты сотрудника.
// Каждый класс должен отвечать только за одну операцию(или хотя бы не за такое большое количество).