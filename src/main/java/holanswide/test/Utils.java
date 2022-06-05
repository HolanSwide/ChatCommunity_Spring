package holanswide.test;

import holanswide.utils.FormatFactory;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

/**
 * @author ：holan
 * @description：DONE
 * @date ：2022/6/4 21:26
 */

public class Utils {
    @Test
    public void testDateToString() throws ParseException {
//        测试 Date 与 String 互换
        Date date=new Date();
        System.out.println("> Date:"+date);
        String str=FormatFactory.DateToString(date);
        System.out.println("> Str:"+str);
        Date date1 = FormatFactory.StringToDate(str);
        System.out.println("> Date1:"+date1);
    }
}
