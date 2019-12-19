package com.hous.util;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;

public class EncryptUtil {
    public static final String MD5 = "MD5";
    public static final String SHA1 = "SHA1";
    public static final String HmacMD5 = "HmacMD5";
    public static final String HmacSHA1 = "HmacSHA1";
    public static final String DES = "DES";
    public static final String AES = "AES";

    /**�����ʽ��Ĭ��ʹ��uft-8*/
    public String charset = "utf-8";
    /**DES*/
    public int keysizeDES = 0;
    /**AES*/
    public int keysizeAES = 128;

    public static EncryptUtil me;

    private EncryptUtil(){
        //����
    }
    //˫����
    public static EncryptUtil getInstance(){
        if (me==null) {
           synchronized (EncryptUtil.class) {
               if(me == null){
                   me = new EncryptUtil();
               }
           }
        }
        return me;
    }

    /**
     * ʹ��MessageDigest���е�����ܣ������룩
     * @param res �����ܵ��ı�
     * @param algorithm �����㷨����
     * @return
     */
    private String messageDigest(String res,String algorithm){
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] resBytes = charset==null?res.getBytes():res.getBytes(charset);
            return base64(md.digest(resBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * ʹ��KeyGenerator���е���/˫����ܣ��������룩
     * @param res �����ܵ�ԭ��
     * @param algorithm  ����ʹ�õ��㷨����
     * @param key ����ʹ�õ���Կ
     * @return
     */
    private String keyGeneratorMac(String res,String algorithm,String key){
        try {
            SecretKey sk = null;
            if (key==null) {
                KeyGenerator kg = KeyGenerator.getInstance(algorithm);
                sk = kg.generateKey();
            }else {
                byte[] keyBytes = charset==null?key.getBytes():key.getBytes(charset);
                sk = new SecretKeySpec(keyBytes, algorithm);
            }
            Mac mac = Mac.getInstance(algorithm);
            mac.init(sk);
            byte[] result = mac.doFinal(res.getBytes());
            return base64(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * ʹ��KeyGenerator˫����ܣ�DES/AES��ע������ת��Ϊ�ַ�����ʱ���ǽ�2����תΪ16���Ƹ�ʽ���ַ���������ֱ��ת����Ϊ�����
     * @param res ���ܵ�ԭ��
     * @param algorithm ����ʹ�õ��㷨����
     * @param key  ���ܵ���Կ
     * @param keysize
     * @param isEncode
     * @return
     */
    private String keyGeneratorES(String res,String algorithm,String key,int keysize,boolean isEncode){
        try {
            KeyGenerator kg = KeyGenerator.getInstance(algorithm);
            if (keysize == 0) {
                byte[] keyBytes = charset==null?key.getBytes():key.getBytes(charset);
                kg.init(new SecureRandom(keyBytes));
            }else if (key==null) {
                kg.init(keysize);
            }else {
                byte[] keyBytes = charset==null?key.getBytes():key.getBytes(charset);
                kg.init(keysize, new SecureRandom(keyBytes));
            }
            SecretKey sk = kg.generateKey();
            SecretKeySpec sks = new SecretKeySpec(sk.getEncoded(), algorithm);
            Cipher cipher = Cipher.getInstance(algorithm);
            if (isEncode) {
                cipher.init(Cipher.ENCRYPT_MODE, sks);
                byte[] resBytes = charset==null?res.getBytes():res.getBytes(charset);
                return parseByte2HexStr(cipher.doFinal(resBytes));
            }else {
                cipher.init(Cipher.DECRYPT_MODE, sks);
                return new String(cipher.doFinal(parseHexStr2Byte(res)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String base64(byte[] res){
        return Base64.encode(res);
    }

    /**��������ת����16���� */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }
    /**��16����ת��Ϊ������*/
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    /**
     * md5�����㷨���м��ܣ������棩
     * @param res ��Ҫ���ܵ�ԭ��
     * @return
     */
    public String MD5(String res) {
        return messageDigest(res, MD5);
    }

    /**
     * md5�����㷨���м��ܣ������棩
     * @param res  ��Ҫ���ܵ�ԭ��
     * @param key  ��Կ
     * @return
     */
    public String MD5(String res, String key) {
        return keyGeneratorMac(res, HmacMD5, key);
    }

    /**
     * ʹ��SHA1�����㷨���м��ܣ������棩
     * @param res ��Ҫ���ܵ�ԭ��
     * @return
     */
    public String SHA1(String res) {
        return messageDigest(res, SHA1);
    }

    /**
     * ʹ��SHA1�����㷨���м��ܣ������棩
     * @param res ��Ҫ���ܵ�ԭ��
     * @param key ��Կ
     * @return
     */
    public String SHA1(String res, String key) {
        return keyGeneratorMac(res, HmacSHA1, key);
    }

    /**
     * ʹ��DES�����㷨���м��ܣ����棩
     * @param res ��Ҫ���ܵ�ԭ��
     * @param key ��Կ
     * @return
     */
    public String DESencode(String res, String key) {
        return keyGeneratorES(res, DES, key, keysizeDES, true);
    }

    /**
     * ��ʹ��DES�����㷨�����Ľ��н��ܣ����棩
     * @param res ��Ҫ���ܵ�����
     * @param key ��Կ
     * @return
     */
    public String DESdecode(String res, String key) {
        return keyGeneratorES(res, DES, key, keysizeDES, false);
    }

    /**
     * ʹ��AES�����㷨���м��ܣ����棩
     * @param res ��Ҫ���ܵ�����
     * @param key ��Կ
     * @return
     */
    public String AESencode(String res, String key) {
        return keyGeneratorES(res, AES, key, keysizeAES, true);
    }

    /**
     * ��ʹ��AES�����㷨�����Ľ��н���
     * @param res ��Ҫ���ܵ�����
     * @param key ��Կ
     * @return
     */
    public String AESdecode(String res, String key) {
        return keyGeneratorES(res, AES, key, keysizeAES, false);
    }

    /**
     * ʹ�������м���
     * @param res ��Ҫ���ܵ�����
     * @param key ��Կ
     * @return
     */
    public String XORencode(String res, String key) {
        byte[] bs = res.getBytes();
        for (int i = 0; i < bs.length; i++) {
            bs[i] = (byte) ((bs[i]) ^ key.hashCode());
        }
        return parseByte2HexStr(bs);
    }

    /**
     * ʹ�������н���
     * @param res ��Ҫ���ܵ�����
     * @param key ��Կ
     * @return
     */
    public String XORdecode(String res, String key) {
        byte[] bs = parseHexStr2Byte(res);
        for (int i = 0; i < bs.length; i++) {
            bs[i] = (byte) ((bs[i]) ^ key.hashCode());
        }
        return new String(bs);
    }

    /**
     * ֱ��ʹ����򣨵�һ���ü��ܣ��ڶ��ε��ý��ܣ�
     * @param res ����
     * @param key ��Կ
     * @return
     */
    public int XOR(int res, String key) {
        return res ^ key.hashCode();
    }

    /**
     * ʹ��Base64���м���
     * @param res ����
     * @return
     */
    public String Base64Encode(String res) {
        return Base64.encode(res.getBytes());
    }

    /**
     * ʹ��Base64���н���
     * @param res
     * @return
     */
    public String Base64Decode(String res) {
        return new String(Base64.decode(res));
    }
}