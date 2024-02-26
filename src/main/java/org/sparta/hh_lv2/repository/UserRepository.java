package org.sparta.hh_lv2.repository;

import org.sparta.hh_lv2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
