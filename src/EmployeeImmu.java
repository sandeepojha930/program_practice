import java.util.Collections;
import java.util.Map;

public class EmployeeImmu {
    private final int id;
    private final Map<String, String> map;
    private final Employee employee;

    public EmployeeImmu(int id, Map<String, String> map, Employee employee) {
        this.id = id;
        this.map = Collections.unmodifiableMap(map);
        Employee tempEmp = new Employee(Integer.valueOf(employee.getId()), employee.getName(), employee.getAge());
        this.employee = tempEmp;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Employee getEmployee() {
        return new Employee(Integer.valueOf(employee.getId()), employee.getName(), employee.getAge());
    }
}
