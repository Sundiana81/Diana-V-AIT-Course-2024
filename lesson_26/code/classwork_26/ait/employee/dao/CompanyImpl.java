package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

public class CompanyImpl implements Company {  // implements otnositsia k interfeisu i nasleduem..

    private Employee[] employees; // sotrudniki
    private int size;
  // capacity maximalnoe kolicestvo liudej
    public CompanyImpl(int capacity) { // int capacuty zaveli sami
        // v objekt vlozil masiv
        this.employees = new Employee[capacity]; // vozmoznoe kol sotrudnikov
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public Employee uodateEmploeey(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmloyeeHoursGreateThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }
}
