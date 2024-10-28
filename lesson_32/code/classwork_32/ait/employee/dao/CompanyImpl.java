package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;
import classwork_32.ait.employee.model.SalesManager;

public class CompanyImpl implements Company {  // implements otnositsia k interfeisu i nasleduem..


    private Employee[] employees; // element массива employees[0], employees[1]
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if (employee == null) {
            return false;
        }
        if (size == employees.length) {
            return false;
        }
        if (findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee; // put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
//                employees[i] = employees[size - 1]; // на место жертвы ставим (копируем) последний элемент массива
//                employees[size - 1] = null; // последний элемент затрем с помощью null
//                size--;
                // с первой позиции на  позицыю и плюс хвост
                // капирует на новое место
                System.arraycopy(employees, i + 1, employees, i , size - i - 1);
                // хвост массива копируем на ту же тозицию i
                employees[size] = null;
                size --;

                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmploeey(Employee employee) {// забераем из employee
        // отыскать нужного в массиве и обнавить ему поля, забирая их из волей
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == employee.getId()) {
//                employees[i].setSecondName(employee.setSecondName());
//                employees[i].setHours(employee.getHours());
//                employees[i].setHours(employee.getHours());
                employees[i] = employee;
                return employees[i];
            }

        }


        return null;
    }


    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {

            totalSalary += employees[i].calcSalary();

        }

        return totalSalary;

    }


    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) { // proveriaem peredkastingom // instanceuf eto da net
                SalesManager sm = (SalesManager) employees[i]; // esli javliaetsia to mi ego delaem
                totalSales += sm.getSalesValue();

            }

        }

        return totalSales;
    }


    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        // Считаем количество сотрудников, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) { // criteria
                count++;
            }
        }
        // Создаем массив для сотрудников, удовлетворяющих условию
        Employee[] result = new Employee[count]; // new array for results
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                result[index++] = employees[i];
            }
        }
        return result;
    }


    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= min && salary <= max) { // bolse cem nim i mense cem max
                count++;
            }
        }

        Employee[] result = new Employee[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= min && salary <= max) {
                result[index++] = employees[i];
            }
        }
        return result;
    }

    @Override
    public double averageSalary() {
        if (size == 0) {
            return 0;
        }
        return totalSalary() / size;
    }


} // end of main