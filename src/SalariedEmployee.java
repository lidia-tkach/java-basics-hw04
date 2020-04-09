public class SalariedEmployee extends Employee {
  public String socialSecurityNumber;
  public double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super.employeeId = employeeId;
    super.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  public int calculatePay() {
    averageMonthlySalary = fixedMonthlyPayment;
    return (int) averageMonthlySalary;
  }
}
