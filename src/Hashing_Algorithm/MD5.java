package Hashing_Algorithm;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String getMD5(String input) {
        try {
   // invoking the static getInstance() method of the MessageDigest class Notice it has MD5 in its parameter.
      MessageDigest msgDigest = MessageDigest.getInstance("MD5");
// the digest() method is invoked to compute the message digest from an input digest() and it returns an array of byte
       byte[] msgArr =  msgDigest.digest(input.getBytes());
// getting signum representation from byte array msgArr
            BigInteger bi = new BigInteger(1,msgArr);
            // Converting into hex value
       String hshtxt = bi.toString(16);
        while (hshtxt.length()>32){
            hshtxt = "0"+hshtxt;
        }
        return hshtxt;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String str ="javatpoint";
        String hash = getMD5(str);
        str = "'javatpoint'";
        System.out.println("The HashCode Generated for " + str + " is: " + hash);

    }
}
