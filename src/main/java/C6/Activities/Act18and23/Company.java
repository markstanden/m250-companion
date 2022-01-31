package C6.Activities.Act18and23;

import java.util.HashMap;

public class Company
{
    private HashMap<String, Employee> employees;

    public Company()
    {
        employees = new HashMap<>();
    }

    public HashMap<String, Employee> getEmployees()
    {
        return employees;
    }

    /**
     * The method should return the name of the employee
     * who occupies the office indicated by the parameter.
     * However, if there is no such office
     * your method should return the string "No such office".
     * @return String The employee name.
     */
    public String getOccupantName(String office){
        Employee occupant = getEmployees().get(office);
        if(occupant == null) {
            return "No such office";
        }
        return occupant.getName();
    }

    /**
     * method should return the office number of the employee whose name is given by the argument.
     * If there is no employee by that name your method should return the string "No such employee".
     */
    public String getOfficeOf(String name){
        return employees.keySet().stream()
                .filter(office -> name.equals(employees.get(office).getName()))
                .findFirst()
                .orElse("No such employee");
    }
}