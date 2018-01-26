package com.greenfoxacademy.dountil.repositories;

import com.greenfoxacademy.dountil.models.Log;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogPaging extends PagingAndSortingRepository<Log, Long> {

}
