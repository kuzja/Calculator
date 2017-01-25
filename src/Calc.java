import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    private String usrString;

    public Calc(String usrString) {
        this.usrString = usrString;
    }

    public long getResult() {

        long result = 0L;
//        String arguments[] = usrString.split(" ");
//
//        if (arguments.length < 3 || arguments.length > 3) {
//            System.out.println("Incorrect parameters!");
//        }
//
//        String op = arguments[1];
//
//        Long param1 = Long.parseLong(arguments[0]);
//        Long param2 = Long.parseLong(arguments[2]);
//
//        if (op.equals(Operation.Add.toString())) {
//            result = param1 + param2;
//        } else if (op.equals(Operation.Sub.toString())) {
//            result = param1 - param2;
//        } else {
//            System.out.println("Incorrect parameters!");
//        }


        Pattern pt = Pattern.compile("(\\d){1,}");
        Matcher mt = pt.matcher(usrString);

        while(mt.find()){

            System.out.println(mt.start());
            System.out.println(mt.end());
        }




        return result;
    }

}
