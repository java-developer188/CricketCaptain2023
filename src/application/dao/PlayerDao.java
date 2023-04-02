package application.dao;
import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import application.entity.Player;

public class PlayerDao {

    private final Dao<Player, Integer> playerDao;

    public PlayerDao() throws SQLException {
        ConnectionSource connectionSource = new JdbcConnectionSource("jdbc:sqlite:cricketcaptain.db");
        playerDao = DaoManager.createDao(connectionSource, Player.class);
        TableUtils.createTableIfNotExists(connectionSource, Player.class);
    }

    public void create(Player player) throws SQLException {
        playerDao.create(player);
    }

    public void update(Player player) throws SQLException {
        playerDao.update(player);
    }

    public void delete(Player player) throws SQLException {
        playerDao.delete(player);
    }

}
