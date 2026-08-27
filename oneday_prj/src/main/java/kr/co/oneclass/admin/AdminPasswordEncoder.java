package kr.co.oneclass.admin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AdminPasswordEncoder {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder =
                new BCryptPasswordEncoder();

        String rawPassword = "1234";

        String encodedPassword =
                encoder.encode(rawPassword);

        System.out.println("원본 비밀번호 : " + rawPassword);
        System.out.println("암호화 비밀번호 : " + encodedPassword);
    }
}