package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

//    - добавление сотрудника +
//    - нахождение сотрудника по id +
//    - обновление cотрудника +
//    - удаление сотрудника +
//    - печать списка сотрудников +
//    - кол-во сотрудников +
//    - объем ФОТ
//    - объем продаж

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    Employee updateEmployee(Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary();

    double totalSales();

    Employee[] findEmployeeHoursGreaterThan(int hours);

    Employee[] findEmployeeSalaryRange(double min, double max);

}
