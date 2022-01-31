package C6.Activities.Act18;

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
}
