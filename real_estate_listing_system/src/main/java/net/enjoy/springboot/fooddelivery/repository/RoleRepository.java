package net.enjoy.springboot.fooddelivery.repository;

import net.enjoy.springboot.fooddelivery.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}