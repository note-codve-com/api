package com.codve.note.api.model.auth;

import com.codve.note.api.model.UserDO;
import lombok.Data;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * @author admin
 * @date 2020/8/19 17:48
 */
@Data
public class AuthUser implements UserDetails, CredentialsContainer {

    private Long id;

    private String username;

    private String password;

    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;

    private Collection<? extends GrantedAuthority> authorities;

    public static AuthUser newInstance(UserDO userDO) {
        AuthUser authUser = new AuthUser();
        authUser.setId(userDO.getId());
        authUser.setUsername(userDO.getMobile());
        authUser.setPassword(userDO.getPassword());

        authUser.setAuthorities(Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")));
        return authUser;
    }

    @Override
    public void eraseCredentials() {
        password = null;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
