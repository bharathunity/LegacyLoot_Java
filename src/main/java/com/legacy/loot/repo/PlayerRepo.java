package com.legacy.loot.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.legacy.loot.entity.Player;

public interface PlayerRepo extends MongoRepository<Player, String> {
    
}
