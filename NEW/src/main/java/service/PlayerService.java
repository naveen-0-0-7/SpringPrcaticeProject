package service;

import Player.Player;
import org.springframework.stereotype.Service;
import Player.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }

    public Player getPlayerByName(String name) {
        return repository.findById(name)
                .orElseThrow(() -> new RuntimeException("Player not found: " + name));
    }

    public Player addPlayer(Player player) {
        return repository.save(player);
    }

    public Player updatePlayer(String name, Player updatedPlayer) {
        Player existing = getPlayerByName(name);
        existing.setNation(updatedPlayer.getNation());
        existing.setPos(updatedPlayer.getPos());
        existing.setAge(updatedPlayer.getAge());
        existing.setMp(updatedPlayer.getMp());
        existing.setGls(updatedPlayer.getGls());
        existing.setAst(updatedPlayer.getAst());
        existing.setTeam(updatedPlayer.getTeam());
        return repository.save(existing);
    }

    public void deletePlayer(String name) {
        repository.deleteById(name);
    }
}
