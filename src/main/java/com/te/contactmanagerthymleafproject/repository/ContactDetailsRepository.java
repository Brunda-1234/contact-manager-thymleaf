package com.te.contactmanagerthymleafproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.contactmanagerthymleafproject.entity.ContactDetails;


@Repository
public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {
	Optional<ContactDetails> findByEmail(String email);
}
