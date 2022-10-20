package com.nestdigital.flightbackend.dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
@Modifying
@Query(value = "DELETE FROM `flights` WHERE `id`=:id",nativeQuery = true)
void deleteflightId(Integer id);

@Query(value = "SELECT `id`, `capacity`, `destination`, `flightname`, `origin` FROM `flights` WHERE `origin` =:origin",nativeQuery = true)
    List<FlightModel> searchflight(String origin);
}
