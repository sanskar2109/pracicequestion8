import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        Pattern P = Pattern.compile("JDBC");
        Matcher m =P.matcher("ABCDJDBCABJDBCC");
        int ctr=0;
        while(m.find())
        {
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
        }
    }
}
