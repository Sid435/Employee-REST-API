package com.employee.employee.repo;

import com.employee.employee.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserInfoRepo extends MongoRepository<UserInfo, String> {
    Optional<UserInfo> findByName(String username);
}
