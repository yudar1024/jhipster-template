package com.mycompany.myapp.repository.rdbms;


import com.mycompany.myapp.domain.rdbms.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
