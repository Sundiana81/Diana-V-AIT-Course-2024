package classwork_27.ait.employee.dao;
// добавление сотрудника +
//- нахождение сотрудника по id +
//- обновление cотрудника +
//- удаление сотрудника +
//- печать списка сотрудников +
//- кол-во сотрудников +
//- объем ФОТ
//- объем продаж
import classwork_27.ait.employee.model.Employee;
//  interfase produmali i napisali metody
public interface Company {  // KLASSS SODERZIT ABSTRAKTNYJ KLASS

    boolean addEmployee(Employee employee);  // on dobavlen, kak porvat , kak nazvat, dat argument

    Employee removeEmployee(int id); // udalenie

    Employee findEmployee(int id); // iscem emploeey

    Employee uodateEmploeey(Employee employee); // novyj emploeey , dobovliaem, dobovliaem zarplatu
   // metod quantiti verniot kolicestvo
    int quantity(); // skolko sotrudnikov rabotaet, kolicestrvo

    void printEmployee(); // raspeciatat sotrudnikov

    double totalSalary();

    double totalSales();

    Employee[] findEmloyeeHoursGreateThan(int hours); //

    Employee[] findEmployeeSalaryRange(double min, double max); //



}
