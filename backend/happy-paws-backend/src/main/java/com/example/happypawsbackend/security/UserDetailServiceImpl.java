package com.example.happypawsbackend.security;

import com.example.happypawsbackend.models.Dueno;
import com.example.happypawsbackend.repositories.DuenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private DuenoRepository duenoRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Dueno dueno = duenoRepository.findOneByCorreo(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con email " + email + " no existe"));

        return new UserDetailsImpl(dueno);
    }
}
