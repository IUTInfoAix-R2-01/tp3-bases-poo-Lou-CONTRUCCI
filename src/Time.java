
public class Time 
{
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second)
	{
		this.hour = hour;                      
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() 
	{
		return hour; 
	}
	
	public int getMinute() 
	{
		return minute;
	}
	
	public int getSecond() 
	{
		return second;
	}
	
	public void setHour(int hour) 
	{
	    this.hour = hour;
	}
	
	public void setMinute(int minute) 
	{
	    this.minute = minute;
	}
	
	public void setSecond(int second) 
	{
	    this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) 
	{
		this.hour = hour;
        this.minute = minute;
        this.second = second;
	}
	
	public String toString() 
	{
		return "The time is " + hour + ":" + minute + ":" + second ;
	}
	
	public Time nextSecond() 
	{
        second++;
        if (second == 60) 
        {
            second = 0;
            minute++;
            if (minute == 60) 
            {
                minute = 0;
                hour++;
                if (hour == 24) 
                {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() 
    {
        second--;
        if (second < 0) 
        {
            second = 59;
            minute--;
            if (minute < 0) 
            {
                minute = 59;
                hour--;
                if (hour < 0) 
                {
                    hour = 23;
                }
            }
        }
        return this;
    }
}