// Jeffrey Yang
//BoardMember.java
//1606512
// Payroll for start up company
//Methods for boardmember class, which extends employee class

public class BoardMember extends Employee{
    BoardMember(int yearsWorked){
        super.setYears(yearsWorked);
    }
    final double YEARLY_BONUS = 20000; // $/year
    final int PAID_VACATION = 20; // days
    final int UNPAID_VACATION = 10; // days
    final int SICK_LEAVE = 10; // days
    final double HEALTH_INSURANCE = 20000;//$/year
    final double INCOME = 200000; // $/year
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    int usedVacation; // keeps track of how much paid vacation
    // has been used.
    int usedSickDays; // keeps track of how many sick days
    // have been used.

    void usePaidVacation(){
        usedVacation++;
    } // adds one to usedvacation

    void useUnpaidVacation(){
        usedUnpaidVacation++;
    } //adds one to usedunpaidvacation

    void useSickDay(){
        usedSickDays++;
    } // adds one to usedSickDays

    void workYear(){
        super.setYears(super.getYears() + 1);

    } // adds one to yearsWorked.

    @Override
    double YTDValue(){
        return (YEARLY_BONUS + HEALTH_INSURANCE + INCOME + PAID_VACATION * (INCOME / 260) + (SICK_LEAVE - usedSickDays) * ((INCOME / 260) / 2));
    } //adds/multiples/divides variables to get YTDValue

    int yearsTillRetirement(){
        return (int) Math.ceil(( 35 -((double)super.getYears() + ((double) usedUnpaidVacation / 260) + (((double) usedVacation / 260) * 2) + ((double) usedSickDays / 260))));
    } //adds/multiples/divides variables to get years till retirement





}