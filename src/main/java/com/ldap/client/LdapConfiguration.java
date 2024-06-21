package com.ldap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;

@Configuration
public class LdapConfiguration {

    @Autowired
    private LdapTemplate ldapTemplate;

}