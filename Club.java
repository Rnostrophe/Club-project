import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club
{
    private ArrayList<Membership> memberList;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        
    }

    /**
     * Method numberOfMembers
     * 
     * return the number of members in the ArraList clubList
     */
    public int numbeOfMembers()
    {
        return memberList.size();
    }
    
    public void Join(Membership member)
    {
        memberList.add(member);
    }
}