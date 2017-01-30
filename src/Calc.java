import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    public String clearString;

    public Calc(String usrString) {
        this.clearString = getClearString(usrString);
    }

    public long getResult() {

        String pattern = "(\\(^-)?\\d+";

        Pattern patternNumbers = Pattern.compile(pattern);
        Matcher matcher = patternNumbers.matcher(clearString);

        ArrayList<Long> numbers = new ArrayList<Long>();

        while (matcher.find()){
            numbers.add(Long.parseLong(matcher.group()));
            System.out.println(matcher.group());
        }

        pattern = "(^\\-)?\\d+";
        Pattern patternOperations = Pattern.compile(pattern);
        String stringOperations[] = patternOperations.split(clearString);

        String op;

        Long result = 0L;

        for (int i = 1; i < stringOperations.length; i++) {
            op = stringOperations[i];
            if (op.equals(Operation.Add.toString())) {
                numbers.set(i, Operation.Add.action(numbers.get(i-1), numbers.get(i)));
            } else {
                numbers.set(i, Operation.Sub.action(numbers.get(i-1), numbers.get(i)));
            }

            result = numbers.get(i);
        }
        return result;
    }

    public String getClearString(String str) {

        Pattern pt = Pattern.compile("(\\s)+");
        Matcher mt = pt.matcher(str);
        return mt.replaceAll("");

    }

}
