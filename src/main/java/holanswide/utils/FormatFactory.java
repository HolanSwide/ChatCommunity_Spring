package holanswide.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 21:18
 */

public class FormatFactory {
    static String datetimeStyle = "yyyy-MM-dd HH:mm:ss";  // 时间格式

    public static String DateToString(Date date) {
        SimpleDateFormat sdf=new SimpleDateFormat(datetimeStyle);
        return sdf.format(date);
    }
    public static Date StringToDate(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datetimeStyle);
        Date date=new Date();
        return simpleDateFormat.parse(simpleDateFormat.format(date));
    }
}
