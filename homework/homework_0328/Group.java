package homework_0328;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Group {
    Map<String,String> memberMap = new HashMap<String,String>();
    Group(Map<String, String> map){
    }

    public Map<String, String> getMemberMap() {
        return memberMap;
    }

    public void setMemberMap(Map<String, String> memberMap) {
        this.memberMap = memberMap;
    }
    public Entry<String, String> getCaptin(Map<String,String> map){
        Entry<String,String> en = null;
        return en;
    }
}
