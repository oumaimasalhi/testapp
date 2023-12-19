package com.data.Project.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.data.Project.entities.produit;

@Repository
//public interface ProduitRepository extends CrudRepository<produit,Long> {
public interface ProduitRepository extends JpaRepository<produit,Long>{

}
