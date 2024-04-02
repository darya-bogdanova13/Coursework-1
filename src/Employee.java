import java.util.Objects;

public class Employee {
    private String fullNameEmployee;
    private int departmentNumberEmployee;
    private int salaryEmployee;
    static int enumerator=1;
    private int id=1;

    public Employee(String fullNameEmployee, int departmentNumberEmployee, int salaryEmployee) {
        this.fullNameEmployee = fullNameEmployee;
        this.departmentNumberEmployee = departmentNumberEmployee;
        this.salaryEmployee = salaryEmployee;
        this.id = enumerator++;
    }

    public String getFullNameEmployee() {
        return this.fullNameEmployee;
    }

    public int getDepartmentNumberEmployee() {
        return this.departmentNumberEmployee;
    }

    public int getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public void setDepartmentNumberEmployee(byte departmentNumberEmployee) {
        this.departmentNumberEmployee = departmentNumberEmployee;
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
        return departmentNumberEmployee == employee.departmentNumberEmployee && salaryEmployee == employee.salaryEmployee &&
                id == employee.id && Objects.equals(fullNameEmployee, employee.fullNameEmployee);

    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameEmployee,departmentNumberEmployee, salaryEmployee, id);
    }
    public String toString(){
        return  "Номер отдела: " + departmentNumberEmployee + ". Сотрудник (ФИО):'" + fullNameEmployee  + ", зарплата: " + salaryEmployee + ".";
    }
}
