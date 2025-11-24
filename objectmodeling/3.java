import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartmentDetails() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyStructure() {
        System.out.println("\nCompany: " + companyName);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        Company company = new Company("Google India");

        Department d1 = new Department("Engineering");
        Department d2 = new Department("Human Resources");

        d1.addEmployee(new Employee("Sonu"));
        d1.addEmployee(new Employee("Aman"));

        d2.addEmployee(new Employee("Riya"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.showCompanyStructure();

        // If company is deleted — departments and employees disappear with it
        // (Composition concept)
    }
}
