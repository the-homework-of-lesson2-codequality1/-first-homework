package util;

import java.text.DecimalFormat;

public class DoubletoStringUtil {
    public static String getstring(double num){
        return new DecimalFormat("0.000").format(num);
    }
}
