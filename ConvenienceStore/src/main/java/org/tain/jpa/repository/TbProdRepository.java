package org.tain.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tain.jpa.domain.TbCust;
import org.tain.jpa.domain.TbProd;

@RepositoryRestResource
public interface TbProdRepository extends JpaRepository<TbProd, Long>{

}
