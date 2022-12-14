package com.gmentor.spring.jpa.postgresql.repository;

import com.gmentor.spring.jpa.postgresql.model.Sponsorship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SponsorshipRepository extends JpaRepository<Sponsorship,Long> {
    List<Sponsorship> findByName(String name);
}
