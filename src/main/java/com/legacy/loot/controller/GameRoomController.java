package com.legacy.loot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legacy.loot.entity.GameRoom;
import com.legacy.loot.service.GameRoomService;

@RestController
@RequestMapping("/api/gameroom")
public class GameRoomController {
    
    @Autowired
    GameRoomService gameRoomService;


    @PostMapping("/create")
    public ResponseEntity<GameRoom> CreateGameRoom(@RequestBody GameRoom gameRoom){
        try{
            return new ResponseEntity<GameRoom>(gameRoomService.CreateGameRoom(gameRoom), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<GameRoom>> GetGameRooms(){
        try {
            return new ResponseEntity<List<GameRoom>>(gameRoomService.GetGameRooms(), HttpStatus.OK);   
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/deleteAllRooms")
    public void DeleteAllRooms(){
        try {
            gameRoomService.DeleteAllRooms();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
