package S.good;

class EmployeeRepository {
    public void saveEmployee(Employee employee) {
        System.out.println("Сотрудник " + employee.getEmployeeId() + " добавлен в реестр");
    }
}
