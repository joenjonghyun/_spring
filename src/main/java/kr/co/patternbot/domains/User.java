package kr.co.patternbot.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

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
@Component //프로퍼티,메소드의 집합은 컴포넌트
@Entity
@Table(name = "users")
//아래는 메소드는 도커로 들어감
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String userid;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;
}

