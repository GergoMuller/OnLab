package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import entities.Player;
import repositories.PlayerRepository;

@Stateless
@LocalBean
public class PlayerService {
	
	@Inject
	PlayerRepository repo;
	
	public void createPlayer(Player player){
		repo.save(player);
	}

}
