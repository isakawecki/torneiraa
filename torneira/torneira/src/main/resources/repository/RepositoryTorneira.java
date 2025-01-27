package com.torneira.torneira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.torneira.torneira.model.ModelTorneira;

@Repository
public interface RepositoryTorneira extends JpaRepository <ModelTorneira, Long>{

}
