package network.starplum.player;

import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.chat.TextComponent;
import network.starplum.Neptune;

/**
 * A simple class with player methods
 * @author iDevMC {@link (https://github.com/iDevMC)}
 * @version 1.0 <br>
 */
@SuppressWarnings("all")
public class PlayerManager {

	public PlayerManager() {}
	
	@Deprecated public static void sendTitle(Player player, String title, String subtitle) { player.sendTitle(title, subtitle, 10, 35, 10); }
	@Deprecated public static void sendSubtitle(Player player, String subtitle) { player.sendTitle("§0", subtitle); }
	public static void sendTitle(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut) { player.sendTitle(title, subtitle, fadeIn, stay, fadeOut); }
	public static void sendSubtitle(Player player, String subtitle, int fadeIn, int stay, int fadeOut) { player.sendTitle("§0", subtitle, fadeIn, stay, fadeOut); }
	public static void resetTitle(Player player) { player.resetTitle(); }
	
	public static void clearPotion(Player player, PotionEffectType potion) { player.getActivePotionEffects().clear(); }
	public static void removePotion(Player player, PotionEffectType potion) { player.removePotionEffect(potion); }
	public static void applyPotion(Player player, PotionEffectType potion) { player.addPotionEffect(new PotionEffect(potion, 30, 0)); }
	public static void applyPotion(Player player, PotionEffectType potion, int duration) { player.addPotionEffect(new PotionEffect(potion, duration, 0)); }
	public static void applyPotion(Player player, PotionEffectType potion, int duration, int amplifier) { player.addPotionEffect(new PotionEffect(potion, duration, amplifier)); }
	public static void applyPotion(Player player, PotionEffectType potion, int duration, int amplifier, boolean ambient) { player.addPotionEffect(new PotionEffect(potion, duration, amplifier, ambient)); }
	public static void applyPotion(Player player, PotionEffectType potion, int duration, int amplifier, boolean ambient, boolean particles) { player.addPotionEffect(new PotionEffect(potion, duration, amplifier, ambient, particles)); }
	public static void applyPotion(Player player, PotionEffectType potion, int duration, int amplifier, boolean ambient, boolean particles, Color color) { player.addPotionEffect(new PotionEffect(potion, duration, amplifier, ambient, particles, color)); }
	
	public static void setOp(Player player, boolean bool) { player.setOp(bool); }
	public static void addOp(Player player) { Bukkit.getOperators().add(player); }
	public static void removeOp(Player player) { Bukkit.getOperators().remove(player); }
	
	public static void setWhitelist(Player player, boolean whitelisted) { player.setWhitelisted(whitelisted); }
	public static void addWhitelist(Player player) { if(!player.isWhitelisted()) { Bukkit.getWhitelistedPlayers().add(player); } else return; }
	public static void removeWhitelist(Player player) { if(player.isWhitelisted()) { Bukkit.getWhitelistedPlayers().remove(player); } else return; }
	
	public static void teleport(Player player, Entity entity) { player.teleport(entity); }
	public static void teleport(Player player, Player entity) { player.teleport(entity); }
	public static void teleport(Player player, Location location) { player.teleport(location); }
	
	public static void playSound(Player player, Sound sound) { player.playSound(player.getLocation(), sound, 1, 1); }
	public static void playSound(Player player, Sound sound, int volume) { player.playSound(player.getLocation(), sound, volume, 1); }
	public static void playSound(Player player, Sound sound, int volume, int pitch) { player.playSound(player.getLocation(), sound, volume, pitch); }
	public static void playSound(Player player, String sound) { player.playSound(player.getLocation(), sound, 1, 1); }
	public static void playSound(Player player, String sound, int volume) { player.playSound(player.getLocation(), sound, volume, 1); }
	public static void playSound(Player player, String sound, int volume, int pitch) { player.playSound(player.getLocation(), sound, volume, pitch); }
	public static void stopSound(Player player, Sound sound) { player.stopSound(sound); }
	public static void stopSound(Player player, String sound) { player.stopSound(sound); }
	public static void stopSound(Player player, Sound sound, SoundCategory category) { player.stopSound(sound, category); }
	public static void stopSound(Player player, String sound, SoundCategory category) { player.stopSound(sound, category); }
	public static void stopSound(Player player, String sound, String category) { player.stopSound(sound, SoundCategory.valueOf(category)); }
	
	@Deprecated public static void playNote(Player player, Location location, byte instrument, byte note) { player.playNote(location, instrument, note); }
	public static void playNote(Player player, Location location, Instrument instrument, Note note) { player.playNote(location, instrument, note); }
	
	@Deprecated public static void playEffect(Player player, Location location, Effect effect, int data) { player.playEffect(location, effect, data); }
	
	@Deprecated public static void showPlayer(Player player, Player toShow) { player.showPlayer(toShow); }
	@Deprecated public static void hidePlayer(Player player, Player toHide) { player.hidePlayer(toHide); }
	public static void revealPlayer(Player player, Player reveal) { player.showPlayer(Neptune.getNeptune(), reveal); }
	public static void vanishPlayer(Player player, Player vanish) { player.hidePlayer(Neptune.getNeptune(), vanish); }
	public static boolean canSeePlayer(Player player, Player canSee) { if(player.canSee(canSee)) { return true; } else return false; }
	
	@Deprecated public static void awardAchievement(Player player, Achievement achievement) { player.awardAchievement(achievement); }
	@Deprecated public static void removeAchievement(Player player, Achievement achievement) { player.removeAchievement(achievement); }
	@Deprecated public static boolean hasAchievement(Player player, Achievement achievement) { if(player.hasAchievement(achievement)) { return true; } else return false; }
	public static AdvancementProgress adv(Player player, Advancement advancement) { return player.getAdvancementProgress(advancement); }
	
	public static void spawnParticle(Player player, Particle particle, double x, double y, double z, int count) { player.spawnParticle(particle, x, y, z, count); }
	public static void spawnParticle(Player player, Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) { player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ); }
	public static void spawnParticle(Player player, Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra) { player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ, extra); }
	public static void spawnParticle(Player player, Particle particle, Location location, int count) { player.spawnParticle(particle, location, count); }
	public static void spawnParticle(Player player, Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ) { player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ); }
	public static void spawnParticle(Player player, Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra) { player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ, extra); }
	
	public static void setStatistic(Player player, Statistic statistic, int value) { player.setStatistic(statistic, value); }
	public static void setStatistic(Player player, Statistic statistic, int value, EntityType entityType) { player.setStatistic(statistic, entityType, value); }
	public static void setStatistic(Player player, Statistic statistic, Material material, int value) { player.setStatistic(statistic, material, value); }
	public static void decrementStatistic(Player player, Statistic statistic) { player.decrementStatistic(statistic); }
	public static void decrementStatistic(Player player, Statistic statistic, int amount) { player.decrementStatistic(statistic, amount); }
	public static void decrementStatistic(Player player, Statistic statistic, EntityType entityType) { player.decrementStatistic(statistic, entityType); }
	public static void decrementStatistic(Player player, Statistic statistic, int value, EntityType entityType) { player.decrementStatistic(statistic, entityType, value); }
	public static void decrementStatistic(Player player, Statistic statistic, Material material) { player.decrementStatistic(statistic, material); }
	public static void decrementStatistic(Player player, Statistic statistic, Material material, int value) { player.decrementStatistic(statistic, material, value); }
	public static void incrementStatistic(Player player, Statistic statistic) { player.incrementStatistic(statistic); }
	public static void incrementStatistic(Player player, Statistic statistic, int value) { player.incrementStatistic(statistic, value); }
	public static void incrementStatistic(Player player, Statistic statistic, EntityType entityType) { player.incrementStatistic(statistic, entityType); }
	public static void incrementStatistic(Player player, Statistic statistic, EntityType entityType, int value) { player.incrementStatistic(statistic, entityType, value); }
	public static void incrementStatistic(Player player, Statistic statistic, Material material) { player.incrementStatistic(statistic, material); }
	public static void incrementStatistic(Player player, Statistic statistic, Material material, int value) { player.incrementStatistic(statistic, material, value); }
	
	/** Texture packs are not used anymore <br> Please refer to{@link PlayerManager#setResourcePack(Player, String)} or {@link PlayerManager#setResourcePack(Player, String, byte[])} */ 
	@Deprecated public static void setTexturePack(Player player, String url) { player.setTexturePack(url); }
	public static void setResourcePack(Player player, String url) { player.setResourcePack(url); }
	public static void setResourcePack(Player player, String url, byte[] hash) { player.setResourcePack(url, hash); }
	
	public static void setSprinting(Player player, boolean bool) { player.setSprinting(bool); }
	public static void setSneaking(Player player, boolean bool) { player.setSneaking(bool); }
	
	public static void setPlayerTime(Player player, long time, boolean relative) { player.setPlayerTime(time, relative); }
	public static void setPlayerWeather(Player player, WeatherType weather) { player.setPlayerWeather(weather); }
	public static void resetPlayerTime(Player player) { player.resetPlayerTime(); }
	public static void resetPlayerWeather(Player player) { player.resetPlayerWeather(); }
	
	/** I don't recommend kicking the player with the default reason <br> Please refer to {@link PlayerManager#kickPlayer(Player, String)} */ 
	@Deprecated public static void kickPlayer(Player player) { player.kickPlayer("Kicked from server by Server"); }
	public static void kickPlayer(Player player, String message) { player.kickPlayer(message); }
	
	public static void chat(Player player, String message) { player.chat(message); }
	public static void performCommand(Player player, String command) { player.performCommand(command); }
	
	public static void sendMessage(Player player, String message) { player.sendMessage(ChatColor.translateAlternateColorCodes('&', message)); }
	public static void sendRawMessage(Player player, String message) { player.sendMessage(message); }
	public static void sendMessage(Player player, TextComponent component) { player.spigot().sendMessage(component); }
	
}
