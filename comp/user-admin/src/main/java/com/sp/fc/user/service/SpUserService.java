package com.sp.fc.user.service;

import com.sp.fc.user.repository.SpUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SpUserService implements UserDetailsService {

    private final SpUserRepository userRepository;

    public SpUserService(SpUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findSpUserByEmail(username)
                .orElseThrow(()->new UsernameNotFoundException(username));
    }

    
}
