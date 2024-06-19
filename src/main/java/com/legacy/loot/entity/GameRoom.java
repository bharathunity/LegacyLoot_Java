package com.legacy.loot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "Game_Room")
public class GameRoom {
    @Id
    private String room_Id;
    private String port_number;
    private String room_name;
    private String region;
    private String max_players;
    private String created_at;

    private String responseCode;
    private String message;

    public GameRoom(String room_Id, String port_number,  String room_name, String region, String max_players, String created_at) {
        this.room_Id = room_Id;
        this.port_number = port_number;
        this.room_name = room_name;
        this.region = region;
        this.max_players = max_players;
        this.created_at = created_at;
    }

    
    
}
