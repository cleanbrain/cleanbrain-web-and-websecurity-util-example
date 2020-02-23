package kr.co.cleanbrain.common.util;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-02-18
 * Time: 오전 9:53
 */
public class StrUtil {
    public static Set<String> asSet(String... args) {
        Set<String> set = new HashSet<String>();
        for (String arg : args)
            set.add(arg);
        return set;
    }

    public static String[] split(String str, String delim) {
        List<String> list = splitToList(str, delim);
        return list.toArray(new String[list.size()]);
    }

    public static List<String> splitToList(String str, String delim) {
        List<String> list = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(str, delim);
        while (st.hasMoreTokens()) {
            String s = st.nextToken().trim();
            if (s.length() > 0)
                list.add(s);
        }
        return list;
    }
}
