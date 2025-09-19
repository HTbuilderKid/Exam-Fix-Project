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
    private int beforeTaxSalary;
    private int taxes;
    private int totalPay;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public boolean onLeave(int leaveTime)
    {
        if(onLeave = true) {
            System.out.println("The employee is on sick leave for " + leaveTime);
        }
        else {
            System.out.println("The employee is still working.");
        }
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
            System.out.println(fullname + " isn't old enough to drive.");
            return false;
        }
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