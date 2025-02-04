
public class Date 
{
    private int day;
    private int month;
    private int year;

    public Date (int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;

    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public void setDate(int d, int m, int y) {
    	this.day = d;
        this.month = m;
        this.year = y;
    }

    public String toString() {
        return    String.format("%02d/%02d/%04d", day, month, year); 
    }
}
