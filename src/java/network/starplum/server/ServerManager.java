package network.starplum.server;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Recipe;
import org.bukkit.util.CachedServerIcon;

import net.md_5.bungee.api.chat.TextComponent;

public class ServerManager {

	public ServerManager() {}

	public static void setWhitelisted(boolean value) { Bukkit.setWhitelist(value); }
	public static void enableWhitelist() { Bukkit.setWhitelist(true); }
	public static void disableWhitelist() { Bukkit.setWhitelist(false); }
	public static void reloadWhietlist() { Bukkit.reloadWhitelist(); }

	public static void shutdown() { Bukkit.shutdown(); }
	public static void restart() { Bukkit.spigot().restart(); }
	public static void reload() { Bukkit.reload(); }
	public static void reloadData() { Bukkit.reloadData(); }

	public static void broadcast(String message) { Bukkit.broadcastMessage(message); }
	public static void broadcast(TextComponent message) { Bukkit.spigot().broadcast(message); }
	public static void broadcast(String message, String permission) { Bukkit.broadcast(message, permission); }

	public static void unloadWorld(String world, boolean save) { Bukkit.unloadWorld(world, save); }
	public static void unloadWorld(World world, boolean save) { Bukkit.unloadWorld(world, save); }

	public static String getId() { return Bukkit.getServerId(); }
	public static String getName() { return Bukkit.getServerName(); }
	public static CachedServerIcon getIcon() { return Bukkit.getServerIcon(); }
	
	public static void setSpawnRadius(int value) { Bukkit.setSpawnRadius(value); }
	public static void resetSpawnRadius() { Bukkit.setSpawnRadius(0); }

	public static void setDefaultGamemode(GameMode gamemode) { Bukkit.setDefaultGameMode(gamemode); }
	public static void resetDefaultGamemode() { Bukkit.setDefaultGameMode(GameMode.ADVENTURE); }

	public static void ipBan(String address) { Bukkit.banIP(address); }
	public static void ipPardon(String address) { Bukkit.unbanIP(address); }

	public static void addRecipe(Recipe recipe) { Bukkit.addRecipe(recipe); }
	public static void clearRecipes() { Bukkit.clearRecipes(); }

	public static void dispatch(String command) { Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command); }
	public static void dispatch(CommandSender sender, String command) { Bukkit.dispatchCommand(sender, command); }

	public static void getPlayer(Player player) { Bukkit.getPlayer(player.getName()); }
	public static void getPlayer(String player) { Bukkit.getPlayer(player); }
	public static void getPlayer(UUID uuid) { Bukkit.getPlayer(uuid); }

	public static class WorldManager {

		public static void createWorld(WorldCreator worldCreator) { Bukkit.createWorld(worldCreator); }
		public static void createWorld(String worldName) {
			WorldCreator creator = new WorldCreator(worldName);
			Bukkit.createWorld(creator);
		}

		public static void createWorld(String worldName, long seed) {
			WorldCreator creator = new WorldCreator(worldName);
			creator.seed(seed);
			Bukkit.createWorld(creator);
		}

		public static void copyWorld(String worldName, World world) {
			WorldCreator creator = new WorldCreator(worldName);
			creator.copy(world);
			Bukkit.createWorld(creator);
		}

		public static void createWorld(String worldName, WorldType type) {
			WorldCreator creator = new WorldCreator(worldName);
			creator.type(type);
			Bukkit.createWorld(creator);
		}

		public static void createWorld(String worldName, long seed, WorldType type) {
			WorldCreator creator = new WorldCreator(worldName);
			creator.seed(seed);
			creator.type(type);
			Bukkit.createWorld(creator);
		}

	}
	
	public static class ServerTime {
		
		public static String getDate() {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			return formatter.format(date);
		}
		
		public static String getDay() {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd");
			return formatter.format(date);
		}
		
		public static String getMonth() {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MM");
			return formatter.format(date);
		}
		
		public static String getYear() {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			return formatter.format(date);
		}
		
		public static String getTime() {
			LocalTime time = LocalTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			return formatter.format(time);
		}
		
		public static String getFullTime() {
			LocalTime time = LocalTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			return formatter.format(time);
		}
	
	}
	
}
