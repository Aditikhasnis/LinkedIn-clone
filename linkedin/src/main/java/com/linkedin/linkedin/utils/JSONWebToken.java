package com.linkedin.linkedin.utils;

import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;


@Component
public class JSONWebToken {
    @Value("${jwt.secret.key}")
    private String secret;


    public SecretKey getKey()
    {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String generateToken(String email)
    {
        long nowMillis = System.currentTimeMillis();
        long expMillis = nowMillis + 1000 * 60 * 60 * 24; // 24 hours

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(nowMillis))
                .setExpiration(new Date(expMillis))
                .signWith(getKey())
                .compact();
    }


    }




