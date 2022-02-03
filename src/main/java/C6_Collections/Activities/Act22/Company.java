package C6_Collections.Activities.Act22;

import C6_Collections.Activities.Act18and23.Employee;

import java.util.HashSet;

public class Company
{
    private HashSet<Employee> employees;

    public Company()
    {
        employees = new HashSet<>();
    }

    public HashSet<Employee> getEmployees()
    {
        return employees;
    }

    /**
     * If an employee with the name given by
     * the argument exists in the employees set,
     * the year they started with the company should be returned,
     * otherwise 0 should be returned.
     * @param name Name of the employee to lookup
     * @return the year the employee started.
     */
    public int yearEmployeeStarted(String name){
        int yearOrZero = employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .map(Employee::getYear)
                .findFirst()
                .orElse(0);

        return yearOrZero;
    }
}
