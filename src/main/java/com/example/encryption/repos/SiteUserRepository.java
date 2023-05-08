package com.example.encryption.repos;

import com.example.encryption.models.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
    public SiteUser getSiteUserByUserName(String userName);
}
