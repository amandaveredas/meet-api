package com.github.amandaveredas.meetreunion.repository;

import com.github.amandaveredas.meetreunion.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoomRepository extends JpaRepository<Room, Long> {
}
