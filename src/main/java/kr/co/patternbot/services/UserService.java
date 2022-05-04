package kr.co.patternbot.services;

import kr.co.patternbot.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.co.patternbot.services
 * fileName     : UserService
 * author       : 전종현
 * date         : 2022-05-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03        전종현       최초 생성
 */
public interface UserService {
    void join(User join);
    String login(User login);
    void logout(User logout);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);
}
