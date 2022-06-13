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
public class EncodeRLE {
    public static String encode(String source) {
        StringBuffer dest = new StringBuffer();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
                runLength++;
                i++;
            }
            //dest.append("@");
            dest.append(runLength);
            dest.append(source.charAt(i));
            
        }
        return dest.toString();
    }
}
