package application.config;
import application.dao.PlayerDao;
import application.entity.Player;

public class Main {
    public static void main(String[] args) throws Exception {
        
        try {
            PlayerDao playerDao = new PlayerDao();
            playerDao.create(new Player("Haider", 12));
        	
        } finally {
            
        }
    }
}
