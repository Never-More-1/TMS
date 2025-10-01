package S.good;

class SalaryRepository {
    public void processSalary(Employee employee) {
        System.out.println("Сотрудник " + employee.getEmployeeId() + " получил зарплату: " + employee.getMoney());
    }
}
