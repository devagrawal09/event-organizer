package edu.uc.cech.agrawadv.eventorganizer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uc.cech.agrawadv.eventorganizer.resource.Resource;
import org.springframework.stereotype.Repository;

@Repository()
public interface ResourceRepository extends JpaRepository<Resource, Integer> {}

