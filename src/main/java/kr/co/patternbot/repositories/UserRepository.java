package kr.co.patternbot.repositories;

import kr.co.patternbot.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.co.patternbot.repositories
 * fileName     : UserRepository
 * author       : 전종현
 * date         : 2022-05-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03        전종현       최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
