import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int idGenerator = 1;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = idGenerator++;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "Full name: " + fullName + "\n Department: " + department + "\n Id: " + id + " \n Salary: " + salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}