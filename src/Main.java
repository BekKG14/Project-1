public class Main {
    public static final Employee[] employees = new Employee[10];
    private static int size = 0;

    public static void main(String[] args) {
        addEmployee(new Employee("Lol Kek Cheburekov", 1, 123));
        addEmployee(new Employee("Kek lol Arbidolov", 2, 1233));
        addEmployee(new Employee("Иванов Иван Иванович", 4, 70000));


        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println("Суммарные затраты на зараплаты: " + sumSalary());
        System.out.println("Максимальная зарплата: " + checkMostSalary());
        System.out.println("Минимальная зарплата: " + checkLeastSalary());
        System.out.println("Средняя зарплата в компании: "+ averageSalary());
        System.out.println("Все сотрудники :"); printAllEmployees();

    }

    public static void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i <= size; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double checkMostSalary() {
        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < size; i++) {
            if (employees[i] != null) {
                double currentSalary = employees[i].getSalary();
                if (maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                }
            }
        }
        return maxSalary;
    }
    public static double checkLeastSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 1; i < size; i++) {
            if (employees[i] != null) {
                double currentSalary = employees[i].getSalary();
                if (minSalary > currentSalary) {
                    minSalary = currentSalary;
                }
            }
        }
        return minSalary;
    }

    public static double averageSalary() {
        double avg = sumSalary() / size;
        return avg;
    }
    public static void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null) {
                int b = i + 1;
                System.out.println(b + ") " + employees[i].getFullName());
        }
        }
    }


}