public class Main {

    private static Employee[] employees = new Employee[10];

    static void base() {
        employees[0] = new Employee("Безрукавый Вадим Петрович ", Employee.enumerator, 50000);
        employees[1] = new Employee("Коток Алексей Юрьевич ", Employee.enumerator, 90000);
        employees[2] = new Employee("Реунов Константин Юрьевич ", Employee.enumerator , 70000);
        employees[3] = new Employee("Постов Андрей Юрьевич ", Employee.enumerator, 60000);
        employees[4] = new Employee("Филиппов Алексей Павлович ", Employee.enumerator, 50000);
        employees[5] = new Employee("Чугунов Сергей Вячеславович ", Employee.enumerator, 70000);
        employees[6] = new Employee("Сырятов Денис Сергеевич ", Employee.enumerator, 50000);
        employees[7] = new Employee("Ищенко Александр Сергеевич ", Employee.enumerator, 40000);
        employees[8] = new Employee("Соловьев Дмитрий Геннадьевич ", Employee.enumerator, 50000);
        employees[9] = new Employee("Корников Алексей Александрович ", Employee.enumerator, 100000);
    }

    public static void main(String[] args) {
        base();
        printEmployee();
        printMin_MaxSalaryEmployee();
        System.out.println("Сумма затрат на ЗП в месяц: " + getSalaryEmployees());
        System.out.println("Среднее значение зарплат: " + getSalaryEmployees() / employees.length);
        printEmployee();
    }
    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
    }

    private static int getSalaryEmployees() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum +=employees[i].getSalaryEmployee();
        }
        return sum;
    }
        private static void printMin_MaxSalaryEmployee () {
            int minSalaryEmployee = employees[0].getSalaryEmployee();
            int maxSalaryEmployee = employees[0].getSalaryEmployee();
            String employeesMinSalary = employees[0].getFullNameEmployee();
            String employeesMaxSalary = employees[0].getFullNameEmployee();
            for (int i = 1; i < employees.length; i++) {
                if (employees[i].getSalaryEmployee() < minSalaryEmployee) {
                    minSalaryEmployee = employees[i].getSalaryEmployee();
                    employeesMinSalary = employees[i].getFullNameEmployee();
                }
                if (employees[i].getSalaryEmployee() > maxSalaryEmployee) {
                    maxSalaryEmployee = employees[i].getSalaryEmployee();
                    employeesMaxSalary = employees[i].getFullNameEmployee();
                }
            }
            System.out.println("Минимальная зарплата у сотрудника: " + employeesMinSalary + " равна: " + minSalaryEmployee);
            System.out.println("Максимальная зарплата у сотрудника: " + employeesMaxSalary + " равна: " + maxSalaryEmployee);
        }
    }