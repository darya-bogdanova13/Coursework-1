import java.util.Objects;

public class Employee {
    private String fullNameEmployee;
    private int salaryEmployee;
    private static int enumerator = 1;
    private int id;
    private int dept;

    public Employee(String fullNameEmployee, int salaryEmployee, int dept) {
        this.fullNameEmployee = fullNameEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = enumerator++;
        this.dept = dept;
    }

    public String getFullNameEmployee() {
        return this.fullNameEmployee;
    }

    public int getDept() {
        return this.dept;
    }

    public int getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salaryEmployee == employee.salaryEmployee &&
                id == employee.id && dept == employee.dept &&
                Objects.equals(fullNameEmployee, employee.fullNameEmployee);
        }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameEmployee, salaryEmployee, id, dept);
    }
    public String toString(){
        return  "Работник № " + id + ". Сотрудник (ФИО):'" + fullNameEmployee  + ", зарплата: " + salaryEmployee + ", отдел " + dept + ".";
    }
    }