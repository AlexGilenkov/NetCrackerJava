package com.netcracker.repository;


import com.netcracker.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
