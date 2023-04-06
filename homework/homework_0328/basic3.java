package homework_0328;

import java.util.List;

public class basic3 {
    public static Integer add(List<?> list){
        Integer sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum +=Integer.valueOf((String) list.get(i));
        }
        return sum;
    }
}
