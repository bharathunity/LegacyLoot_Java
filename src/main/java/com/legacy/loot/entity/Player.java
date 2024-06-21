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
    private String joined_at;
    private String room_name;
    private String region;
    private String port_number;
}
