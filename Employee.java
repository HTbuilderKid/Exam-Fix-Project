/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    private double beforeTaxSalary;
    private double taxes;
    private double totalPay;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public boolean onLeave()
    {
        return onLeave;
    }
    
    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }
    
    /**
     * Returns true if an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age >= 16) {
            System.out.println(fullname + " is old enough to drive.");
            return true;
        }
        else {
            int yearsLeft = 16 - age;
            System.out.println(fullname + " isn't old enough to drive. " +
                               "They need " + yearsLeft + "more year(s).");
            return false;
        }
    }
    
    public void addUnpaidHours(double hours){
        unpaidHours += hours;
    }
    
    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        beforeTaxSalary = hourlyWage * unpaidHours;
        taxes  = beforeTaxSalary * 0.3;
        totalPay = beforeTaxSalary - taxes;
        return totalPay; 
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double pay = calculatePay();
        System.out.printf(fullname + " has received a wire transfer of " + pay); ///+ pay);
        unpaidHours = 0;
    }
}