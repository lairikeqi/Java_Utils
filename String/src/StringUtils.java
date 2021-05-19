import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static void main(String[] args) {


        String arr[] = {"1","2","3"};
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(arr.toString());
        System.out.println(list.toString());

        //Long quota = 5000L;
        //Double ss = Double.valueOf(quota);
        //System.out.println(ss);
//        int a = 0;
//        new StringUtils().test(++a);
    }

    private void test(int a) {
        System.out.println(a);
    }
}
