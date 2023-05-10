package com.api.dslist.services;

import com.api.dslist.dto.GameDTO;
import com.api.dslist.dto.GameMinDTO;
import com.api.dslist.entities.Game;
import com.api.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO buscarPorId(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> listar() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
