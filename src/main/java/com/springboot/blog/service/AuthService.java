package com.springboot.blog.service;

import com.springboot.blog.payload.LoginDto;
import com.springboot.blog.payload.SignupDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String signup(SignupDto signupDto);
}
