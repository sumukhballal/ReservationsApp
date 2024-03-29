package com.devops.reservations.data.repository;

import com.devops.reservations.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface RoomRepository  extends CrudRepository<Room, Long>{

    Room findByNumber(String roomNumber);
}
