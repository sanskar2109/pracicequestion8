import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Pattern P = Pattern.compile("JDBC");
        Matcher m =P.matcher("ABCDJDBCABJDBCC");
        int ctr=0;
        while(m.find())
        {
            ctr++;
        }
        System.out.println(ctr);

    }
}
