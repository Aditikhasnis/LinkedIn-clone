package com.linkedin.linkedin.utils;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Component
public class Encoder {

    public String encode(String rawString)
    {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return Base64.getEncoder().encodeToString(digest.digest(rawString.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean matches(String rawString , String encodedString)
    {
        if(rawString.isBlank()|| encodedString.isBlank())
        {
            return false;
        }
        return encode(rawString).equals(encodedString);
    }
}
