class Employee {
    protected String empName, empId, address, mailId;
    protected long mobileNo;
    protected double basicPay;

    // Constructor to initialize common attributes
    public Employee(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    // Method to calculate allowances
    public double calculateAllowances() {
        double DA = 0.97 * basicPay;   // 97% of basic pay
        double HRA = 0.10 * basicPay;  // 10% of basic pay
        return DA + HRA;
    }

    // Method to calculate deductions
    public double calculateDeductions() {
        double PF = 0.12 * basicPay;   // 12% of basic pay
        double staffClubFund = 0.001 * basicPay; // 0.1% of basic pay
        return PF + staffClubFund;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        double grossSalary = basicPay + calculateAllowances();
        return grossSalary - calculateDeductions();
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + empName + ", ID: " + empId + ", Address: " + address);
        System.out.println("Mail ID: " + mailId + ", Mobile No: " + mobileNo + ", Basic Pay: " + basicPay);
    }
}

// Derived class: Programmer
class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Programmer");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Derived class: Team Lead
class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Team Lead");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Derived class: Assistant Project Manager
class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Assistant Project Manager");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Derived class: Project Manager
class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Project Manager");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create a Programmer
        Programmer programmer = new Programmer("Alice", "P001", "123 St, City", "alice@mail.com", 9876543210L, 60000);
        programmer.displayDetails();
        
        System.out.println();

        // Create a Team Lead
        TeamLead teamLead = new TeamLead("Bob", "TL002", "456 St, City", "bob@mail.com", 9876543211L, 80000);
        teamLead.displayDetails();

        System.out.println();

        // Create an Assistant Project Manager
        AssistantProjectManager apm = new AssistantProjectManager("Charlie", "APM003", "789 St, City", "charlie@mail.com", 9876543212L, 100000);
        apm.displayDetails();

        System.out.println();

        // Create a Project Manager
        ProjectManager projectManager = new ProjectManager("Diana", "PM004", "101 St, City", "diana@mail.com", 9876543213L, 120000);
        projectManager.displayDetails();
    }
}
