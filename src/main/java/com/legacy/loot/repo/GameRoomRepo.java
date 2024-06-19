package com.legacy.loot.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.legacy.loot.entity.GameRoom;



public interface GameRoomRepo extends MongoRepository<GameRoom, String> {
    
    @Query("{'room_name' : ?0}")
    GameRoom FindGameRoomByName(String room_name);

    @Query("{'port_number': ?0}")
    GameRoom FindGameRoomWithPortNumber(String port_number);
}
