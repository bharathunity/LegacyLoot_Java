package com.legacy.loot.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legacy.loot.entity.GameRoom;
import com.legacy.loot.repo.GameRoomRepo;

@Service
public class GameRoomService {
    
    @Autowired
    GameRoomRepo gameRoomRepo;

    GameRoom gameRoomCache;

    public GameRoom CreateGameRoom(GameRoom gameRoom){
        gameRoomCache = gameRoomRepo.FindGameRoomByName(gameRoom.getRoom_name());
        if(gameRoomCache == null){
            gameRoomCache = gameRoomRepo.FindGameRoomWithPortNumber(gameRoom.getPort_number());
            if(gameRoomCache == null){
                LocalDateTime localDateTime = LocalDateTime.now();
                gameRoom.setCreated_at(localDateTime.toString());
                gameRoomRepo.save(gameRoom);
                return GameRoomOutput(gameRoom, "200", "New game room created sucessfully");
            }else{
                return GameRoomOutput(gameRoom, "500", "Try with the different Port number");  
            }
        }else{
            return GameRoomOutput(gameRoom, "500", "Failed to create a game room or room already exists or port already exists");
        }
    }

    public List<GameRoom> GetGameRooms(){
        return gameRoomRepo.findAll();
    }

    public void DeleteAllRooms(){
        gameRoomRepo.deleteAll();
       // return GameRoomOutput(null, "200", "All the rooms are deleted");
    }

    public GameRoom GameRoomOutput(GameRoom gameRoom, String responseCode, String message){
        gameRoom.setResponseCode(responseCode);
        gameRoom.setMessage(message);
        return gameRoom;
    }
}
