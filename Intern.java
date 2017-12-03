public class Intern extends Employee{
    Intern(int yearsworked){
        super.setYears(yearsworked);
    }
    final int UNPAID_VACATION = 10; // days
    final double HEALTH_INSURANCE = 5000; // $/year
    final double INCOME = 40000; // $/year
    int usedUnpaidVacation; // keeps track of how much
    //unpaid vacation has been used.
    void useUnpaidVacation(){
        usedUnpaidVacation++;
    }
    void workYear(){
        super.setYears(getYears() + 1);
    }
    double YTDValue(){
        return HEALTH_INSURANCE + INCOME;
    }
    int yearsTillRetirement(){
        return (int) (35 - (super.getYears() + ((double) usedUnpaidVacation / 260)));
    }




}
