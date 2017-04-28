package camt.cbsd.security.repository;

import camt.cbsd.entity.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Biggy's Dell Laptop on 28-Apr-17.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
