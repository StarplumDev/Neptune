package network.starplum.server;

import org.bukkit.Bukkit;

public class ProxiedConsole {

	public static void sendInformation(String message) { Bukkit.getLogger().info("(Starplum) " + message); }
	public static void sendInformation(String message, boolean prefix) { if(prefix) { Bukkit.getLogger().info("(Starplum) " + message); } else { Bukkit.getLogger().info(message); }}
	public static void sendWarning(String message) { Bukkit.getLogger().warning("(Starplum) " + message); }
	public static void sendWarning(String message, boolean prefix) { if(prefix) { Bukkit.getLogger().info("(Starplum) " + message); } else { Bukkit.getLogger().info(message); }}
	public static void sendError(String message) { Bukkit.getLogger().severe("(Starplum) " + message); }
	public static void sendError(String message, boolean prefix) { if(prefix) { Bukkit.getLogger().info("(Starplum) " + message); } else { Bukkit.getLogger().info(message); }}
	
}
