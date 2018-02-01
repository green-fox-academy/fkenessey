package com.greenfoxacademy.pallidaretake.repositories;

import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MerchandiseRepository extends CrudRepository<Merchandise, Long>{

  @Query(value = "SELECT DISTINCT itemName FROM Merchandise")
  List<String> findAllDistinctItemNames();

  @Query(value = "SELECT DISTINCT size FROM Merchandise")
  List<String> findAllDistinctSize();

  List<Merchandise> findAllByItemName(String itemName);

  Merchandise findDistinctByItemNameAndAndSize(String itemName, String size);
}
