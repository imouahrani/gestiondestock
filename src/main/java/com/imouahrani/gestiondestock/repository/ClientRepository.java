package com.imouahrani.gestiondestock.repository;

import com.imouahrani.gestiondestock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
