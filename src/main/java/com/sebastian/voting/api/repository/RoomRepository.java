package com.sebastian.voting.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sebastian.voting.api.models.RoomModel;

@Repository
public interface RoomRepository extends CrudRepository<RoomModel,Long> {

}
