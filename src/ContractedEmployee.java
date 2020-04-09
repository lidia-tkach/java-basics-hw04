public class ContractedEmployee extends Employee {
    public String federalTaxId;
    public double hourlyRate;
    public double numberOfHoursWorked;

    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super.employeeId = employeeId;
        super.name = name;
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;
        return (int) averageMonthlySalary;
    }

}
