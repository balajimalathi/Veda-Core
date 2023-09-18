package com.veda.repository.master;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.veda.entity.master.Profile;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface ProfileRepository extends PagingAndSortingRepository<Profile, UUID>{
    
}