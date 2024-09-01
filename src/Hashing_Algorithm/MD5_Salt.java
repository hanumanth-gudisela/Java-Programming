package Hashing_Algorithm;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MD5_Salt {

    public  static byte[] getReceiveSalt() throws NoSuchAlgorithmException{
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[15];
        secureRandom.nextBytes(salt);
        return salt;
    }

    private static String getSecurePswd(String psdToHash, byte[] saltArr){
        String generatedpwsd = null;
        try {
            MessageDigest msgDigest = MessageDigest.getInstance("MD5");
            msgDigest.update(saltArr);
            byte[] b = msgDigest.digest(psdToHash.getBytes());
            StringBuilder sb = new StringBuilder();

            for (int i=0;i<b.length;i++){
                sb.append(Integer.toString((b[i] & 0xff)+0x100,16).substring(1));
            }
            generatedpwsd= sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return  generatedpwsd;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = "javatpoint";
        byte[] saltArr = getReceiveSalt();
        String securePsd = getSecurePswd(str, saltArr);
        System.out.println("The HashCode Generated for " + str + " is: " + securePsd);
        String regeneratedPswdToVerify = getSecurePswd(str, saltArr);
        System.out.println("The HashCode Generated for " + str + " is: " + securePsd);
    }

}
