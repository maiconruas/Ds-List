package com.api.dslist.controllers;

import com.api.dslist.dto.GameMinDTO;
import com.api.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> listar() {
        List<GameMinDTO> result = gameService.listar();
        return result;
    }
}
