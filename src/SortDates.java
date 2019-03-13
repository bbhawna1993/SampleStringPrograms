import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class SortDates {

    public static void main(String[] args) throws ParseException
    {
        ArrayList dates=new ArrayList();
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        Date date1=format.parse("27-01-1993");
        Date date2=format.parse("02-10-1993");
        Date date3=format.parse("03-06-1994");

        dates.add(date1);
        dates.add(date2);
        dates.add(date3);

        Iterator itr=dates.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
