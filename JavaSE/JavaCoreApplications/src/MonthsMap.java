
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ali
 */
public class MonthsMap {

    private static  final String mJune = "June";
    private static final String mSeptember = "September";
    private static final String mMarch = "March";

    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap<>();

        //TODO replace names with constant (final) String variables
        months.put(mJune, 6);
        months.put(mSeptember, 9);
        months.put(mMarch, 5);

        //TODO Fix March with the proper value (3)
        months.put(mMarch, 3);

        //TODO Remove June
        months.remove(mJune);

        //Print the contentof the map
        System.out.println("Here are some interesting months");
        for (Map.Entry<String, Integer> month : months.entrySet()) {
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }
    }
}
