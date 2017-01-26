import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    private String usrString;
    public String clearString;

    public Calc(String usrString) {
        this.usrString = usrString;
    }

    public long getResult() {

        clearString = clearString(usrString);

        Pattern pattern1 = Pattern.compile("(\\+|-)");
        String stringNumbers[] = pattern1.split(clearString);

        Pattern pattern2 = Pattern.compile("(\\d+)");
        String stringOperations[] = pattern2.split(clearString);

        return getResult(stringOperations[1], Integer.parseInt(stringNumbers[0]), Integer.parseInt(stringNumbers[1]));
    }

    public String clearString(String str) {

        Pattern pt = Pattern.compile("(\\s)+");
        Matcher mt = pt.matcher(str);
        return mt.replaceAll("");

    }

    private long getResult(String operation, int firstNumber, int seconfNumber) {

        if (operation.equals(Operation.Add.toString())) {
            return firstNumber + seconfNumber;
        } else {
            return firstNumber - seconfNumber;
        }

    }

}
