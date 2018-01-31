package com.greenfoxacademy.pallida.repositories;

import com.greenfoxacademy.pallida.models.LicencePlate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicencePlateRepository extends CrudRepository<LicencePlate, Long>{

  List<LicencePlate> findAllByLicencePlateStartsWithOrderByYearAsc(String policeFilter);

  List<LicencePlate> findAllByBrandOrderByYearAsc(String brandFilter);

  List<LicencePlate> findAllByLicencePlateContainsOrderByYearAsc(String plateNumber);
}
