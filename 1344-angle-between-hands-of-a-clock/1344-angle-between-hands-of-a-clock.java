class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12)
        hour=0;
        double d= Math.abs(30*hour-5.5*minutes);
        if(d>180)
        return(double)(360-d);
        else
        return(double)(d);
    }
}