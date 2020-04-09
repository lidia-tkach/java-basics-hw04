public class Employee implements Payable {
  public String employeeId;
  public String name;
  public double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public Employee() {
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  public int calculatePay() {
    return (int) averageMonthlySalary;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return "The employee's name is " + name + ". The ID is " + employeeId + ". The average monthly salary is " + String.format(format, averageMonthlySalary) + ".";
  }
}
