package S.good;

class Employee {
    private String employeeId;
    private int money;

    public Employee(String employeeId, int money) {
        this.employeeId = employeeId;
        this.money = money;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
//Этот код  соответствует принципу единственной ответственности,
// т.к. в одном классе находится одна логика(одна присчина для изменения).