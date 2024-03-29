package com.jcayllahua.giancarlowebcopy.api.iam.infrastructure.persistence.jpa.repositories;

import com.jcayllahua.giancarlowebcopy.api.iam.domain.model.aggregates.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
