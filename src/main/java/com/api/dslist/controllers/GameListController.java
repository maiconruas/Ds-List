package com.api.dslist.controllers;


import com.api.dslist.dto.GameListDTO;
import com.api.dslist.dto.GameMinDTO;
import com.api.dslist.services.GameListService;
import com.api.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> listar() {
        List<GameListDTO> result = gameListService.listar();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> listarGameList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.listarGameList(listId);
        return result;
    }
}