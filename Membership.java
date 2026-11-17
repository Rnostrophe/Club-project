
/**
 * Write a description of class Membership here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Membership
{
    // Name of member
    private String name;
    // Month if membership withdrawal
    private int month;
    // Year of membership withdrawal
    private int year;

    /**
     * Constructor for objects of class Membership
     */
    public Membership(String name, int month, int year)
    {
        this.name = name;
        this.month = month;
        this.year = year;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
        public int getMonth()
    {
        return month;
    }
    
        public int getYEar()
    {
        return year;
    }
}