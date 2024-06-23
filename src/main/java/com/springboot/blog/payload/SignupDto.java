package com.springboot.blog.payload;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
