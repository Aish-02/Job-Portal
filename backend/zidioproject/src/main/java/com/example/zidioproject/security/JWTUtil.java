package com.example.zidioproject.security;

import java.security.Key;
import java.util.Date;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTUtil {
	 private final String SECRET = "my_super_secret_key_that_is_at_least_32_characters";
	    private final Key SECRET_KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

			public String generateToken(String email){

			return Jwts.builder().
			setSubject(email).
			setIssuedAt(new Date()).
			setExpiration(new Date(System.currentTimeMillis()+1000 * 60 * 60 * 5))
			.signWith(SECRET_KEY, SignatureAlgorithm.HS256)
            .compact();
			}

			public boolean validateToken(String token) {
		        try {
		            Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token);
		            return true;
		        } catch (Exception e) {
		            return false;
		        }
		    }

		    public String extractEmail(String token) {
		        return getClaims(token).getSubject();
		    }

		    private Claims getClaims(String token) {
		        return Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
		    }

	
//	public boolean validateToken(String token, UserDetails userDetails) {
//	final String email = extractEmail(token);
//		return (email.equals(userDetails.getUsername()));
//	}


}
