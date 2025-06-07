package controller;

import Player.Player;
import org.springframework.web.bind.annotation.*;
import service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Player> getAll() {
        return service.getAllPlayers();
    }

    @GetMapping("/{name}")
    public Player getByName(@PathVariable String name) {
        return service.getPlayerByName(name);
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return service.addPlayer(player);
    }

    @PutMapping("/{name}")
    public Player update(@PathVariable String name, @RequestBody Player player) {
        return service.updatePlayer(name, player);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        service.deletePlayer(name);
    }
}
