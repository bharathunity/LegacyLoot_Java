package com.legacy.loot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legacy.loot.entity.Player;
import com.legacy.loot.repo.PlayerRepo;

@Service
public class PlayerService {
    
    @Autowired
    private PlayerRepo _playerRepo;
    
    public void SavePlayerData(Player player, String responseCode, String message){
        if(player == null)
            return;
        _playerRepo.save(PlayerOutPut(player, responseCode, message));
    }

    public Player PlayerOutPut(Player player, String responseCode, String message){
        player.setMessage(message);
        player.setResponseCode(responseCode);    
        return player; 
    }

}
