public class Main {
    private static final Employee[] employees = new Employee[10];
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
        employees[1].toString();
    }

    private static void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        }
    }

    private static double sumSalary() {
        double sum = 0;
        for (int i = 0; i <= size; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    private static double checkMostSalary() {
        double maxSalary = Double.MIN_VALUE;
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
    private static double checkLeastSalary() {
        double minSalary = Double.MAX_VALUE;
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

    private static double averageSalary() {
        if (size > 0) {
            double avg = sumSalary() / size;
            return avg;
        }else {
            return 0;
        }
    }
    private static void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null) {
                int b = i + 1;
                System.out.println(b + ") " + employees[i].getFullName());
        }
        }
    }

        }

