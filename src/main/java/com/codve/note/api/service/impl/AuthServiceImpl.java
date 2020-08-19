package com.codve.note.api.service.impl;

import com.codve.note.api.model.auth.AuthUser;
import com.codve.note.api.service.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author admin
 * @date 2020/8/19 17:37
 */
public class AuthServiceImpl implements AuthService {

    private AuthenticationManager authenticationManager;



    @Override
    public String passwordAuth(String mobile, String password) {
        Authentication authentication = new UsernamePasswordAuthenticationToken(mobile, password);
        authentication = authenticationManager.authenticate(authentication);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        AuthUser user = (AuthUser) authentication.getPrincipal();
        user.eraseCredentials();

        String key = generateKey();
        String value = "";
    }
}
