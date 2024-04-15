public class Main {

    private static Employee[] employees = new Employee[10];

    static void base() {
        employees[0] = new Employee("Безрукавый Вадим Петрович ", 50000, 1);
        employees[1] = new Employee("Коток Алексей Юрьевич ", 90000, 2);
        employees[2] = new Employee("Реунов Константин Юрьевич ", 70000, 3);
        employees[3] = new Employee("Постов Андрей Юрьевич ", 60000, 4);
        employees[4] = new Employee("Филиппов Алексей Павлович ", 50000, 5);
        employees[5] = new Employee("Чугунов Сергей Вячеславович ", 70000, 1);
        employees[6] = new Employee("Сырятов Денис Сергеевич ", 50000, 2);
        employees[7] = new Employee("Ищенко Александр Сергеевич ", 40000, 3);
        employees[8] = new Employee("Соловьев Дмитрий Геннадьевич ", 50000, 4);
        employees[9] = new Employee("Корников Алексей Александрович ", 100000, 5);
    }

    public static void main(String[] args) {
        base();
        printEmployee();
        getSalaryEmployees();
        System.out.println("Сумма затрат на ЗП в месяц: " + getSalaryEmployees());
        printEqualSalary();
        System.out.println("Среднее значение зарплат: " + printEqualSalary());
        printMinSalaryEmployee();
        System.out.println("Минимальная зарплата у сотрудника: " + printMinSalaryEmployee());
        printMaxSalaryEmployee();
        System.out.println("Максимальная зарплата у сотрудника: " + printMaxSalaryEmployee());
        printEmployeeFullName();
    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int getSalaryEmployees() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryEmployee();
        }
        return sum;
    }

    private static int printEqualSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryEmployee();
        }
        sum = sum / employees.length;
        return sum;
    }
    public static Employee printMinSalaryEmployee() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryEmployee() < minSalary) {
                minSalary = employees[i].getSalaryEmployee();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
        public static Employee printMaxSalaryEmployee() {
            int maxSalary = Integer.MIN_VALUE;
            Employee employeeWithMaxSalary = null;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalaryEmployee() > maxSalary) {
                    maxSalary = employees[i].getSalaryEmployee();
                    employeeWithMaxSalary = employees[i];
                }
            }
                return employeeWithMaxSalary;
        }

    private static void printEmployeeFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО: " + employees[i].getFullNameEmployee());
        }
    }
}
