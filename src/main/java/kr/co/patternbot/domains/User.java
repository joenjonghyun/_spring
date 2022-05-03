package kr.co.patternbot.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: kr.co.patternbot.domains
 * fileName     : User
 * author       : 전종현
 * date         : 2022-05-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03        전종현       최초 생성
 */
@Data
@Component
public class User {
    private String userid;
    private String password;
    private String email;
    private String name;
    private String phone;
    private String birth;
    private String address;
}

