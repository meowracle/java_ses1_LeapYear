public class LeapYear {
    public int year;
    public boolean isLeapYear = false;

    public LeapYear(){
    }

    public LeapYear(int year) {
        this.year = year;
    }

    public void displayResult(){
        if (this.isLeapYear == true) {
            System.out.println("Nam " + this.year + " la nam nhuan");
        } else {
            System.out.println("Nam " + this.year + " khong la nam nhuan");
        }
    }


    public void checkLeapYear(){
        if (this.year % 4 ==0 && this.year % 100 != 0) {
            isLeapYear = true;
        } else if (this.year % 400 == 0) {
            isLeapYear = true;
        }
        this.displayResult();
    }
}
