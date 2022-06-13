/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kompresiteksrle;

/**
 *
 * @author USER
 */
import java.util.regex.*;

public class DecodeRLE {
    public static String decode(String src){
        StringBuilder sb = new StringBuilder();
        Pattern ptn = Pattern.compile("[0-9]+|[a-zA-Z]");
        Matcher mth = ptn.matcher(src);
        while (mth.find()){
            int number = Integer.parseInt(mth.group());
            mth.find();
            while (number-- != 0){
                sb.append(mth.group());
            }
        }
        /**for (int i = 0; i < src.length() - 1; i = i + 2) {
            char charAt = src.charAt(i);
            int cnt = src.charAt(i + 1) - '0';
            for (int j = 0; j < cnt; j++) {
		sb.append(charAt);
            }
        }*/
        return sb.toString();
    }
    
}
