package com.github.shadenhand.SimpleLoot;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
public final class simpleloot extends JavaPlugin implements Listener{
	@Override
	public void onEnable(){
		this.saveDefaultConfig();
		getLogger().info("SimpleLoot v1 Loaded!");
		Bukkit.getPluginManager().registerEvents(this, this);
			}
	@Override 
	public void onDisable(){
		getLogger().info("SimpleLoot v1 unloaded!");
	}
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onEntDie(EntityDeathEvent event)  {
		String configcheck = simpleloot.this.getConfig().getString("MobsDropLoot");		
		if(configcheck=="true"){
		Entity e = event.getEntity();
		Player killer = ((LivingEntity) e).getKiller();
// IF THE MOB IS KILLED BY A PLAYER
		if(killer!=null){
// CHECK MOB TYPE		
	    if (e.getType().equals(EntityType.ZOMBIE)){
			Location loc = e.getLocation();
			String Droploot = simpleloot.this.getConfig().getString("ZombiesDropLoot");
			int loot = simpleloot.this.getConfig().getInt("ZombieLoot");
			int qty = simpleloot.this.getConfig().getInt("ZombieLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("ZombieLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
   						getLogger().info("yay! Dropped " + qty + " pieces of " + loot);
					}
					else{
						getLogger().info("Dice fizzled");
					}
				}

		}
	}
}		
		
}
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event)  {
		Block b = event.getBlock();
		Player p = event.getPlayer();
        Location loc = b.getLocation();
        byte data = b.getData();
        
// Check to see if it's grass
        if (b.getTypeId() == 31 && data==1) {
    		int percent = simpleloot.this.getConfig().getInt("GrassLootChance");
			Random rand = new Random();
			// check to see if they're lucky
			if(rand.nextInt(100)<=percent){    			
				// dispense prize
    			p.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
                event.setCancelled(true);
                b.getWorld().dropItemNaturally(loc,new ItemStack(388,1));
                b.setType(Material.AIR);
                }
            }
        }

}
