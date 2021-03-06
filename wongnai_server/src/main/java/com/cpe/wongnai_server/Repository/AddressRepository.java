package com.cpe.wongnai_server.Repository;

import com.cpe.wongnai_server.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface AddressRepository extends JpaRepository<Address, Long> {
    Address findByProvincename(String provincename);
}