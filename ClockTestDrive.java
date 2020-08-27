class Clock
{
    String time;

    void setTime(String t)
    {
        time = t;
    }

    String getTime()    // Getter Method has a return type by definition
    {
        return time;
    }
}

class ClockTestDrive
{
    public static void main(String[] args)
    {
        Clock c = new Clock();
        c.setTime("12:45");
        String tod = c.getTime();
        System.out.println("Time: " + tod);
    }
}