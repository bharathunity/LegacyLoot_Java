package com.legacy.loot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Player")
public class Player {
    @Id
    private String player_Id;
    private String player_name;
    private String room_name;
    private String region;
    private String port_number;
    private String gold_coins;
    private String silver_coins;
    private String bronze_coins;
    private String joined_at;
    private String time_spent;

    private String message;
    private String responseCode;

}
