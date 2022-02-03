package C6_Collections.Quiz3;

public class Employee
{
    private int employeeID;

    //Write your declaration of nextEmployeeID here and initialise it to 1.
    public static int nextEmployeeID = 1;

    //Write your constructor here
    public Employee(){
        employeeID = Employee.nextEmployeeID;
        Employee.nextEmployeeID++;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }
}