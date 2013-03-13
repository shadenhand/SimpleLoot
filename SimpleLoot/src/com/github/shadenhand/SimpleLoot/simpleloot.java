package com.github.shadenhand.SimpleLoot;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
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
// Make sure the mob was killed by a player
		if(killer!=null){
			String Droploot;
			int loot;
			int qty;
			Location loc = e.getLocation();
		//Check the mob type
		switch(e.getType()){
		case CAVE_SPIDER:
			Droploot = simpleloot.this.getConfig().getString("CaveSpidersDropLoot");
			loot = simpleloot.this.getConfig().getInt("CaveSpiderLoot");
			qty = simpleloot.this.getConfig().getInt("CaveSpiderLootQTY");
				if(qty>0 && Droploot=="true"){
					//make sure every things in order, then test their luck
					int percent = simpleloot.this.getConfig().getInt("CaveSpiderLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}					
				}
			break;
		case CREEPER:
			
			Droploot = simpleloot.this.getConfig().getString("CreepersDropLoot");
			loot = simpleloot.this.getConfig().getInt("CreeperLoot");
			qty = simpleloot.this.getConfig().getInt("CreeperLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("CreeperLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}					
				}			
			break;
		case ENDERMAN:
			Droploot = simpleloot.this.getConfig().getString("EndermenDropLoot");
			loot = simpleloot.this.getConfig().getInt("EndermanLoot");
			qty = simpleloot.this.getConfig().getInt("EndermanLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("EndermanLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));   					
					}
				}
			break;
		case PLAYER:
			Droploot = simpleloot.this.getConfig().getString("PlayersDropLoot");
			loot = simpleloot.this.getConfig().getInt("PlayerLoot");
			qty = simpleloot.this.getConfig().getInt("PlayerLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("PlayerLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}
				}
			break;
		case SILVERFISH:
			Droploot = simpleloot.this.getConfig().getString("SilverfishDropLoot");
			loot = simpleloot.this.getConfig().getInt("SilverfishLoot");
			qty = simpleloot.this.getConfig().getInt("SilverfishLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("SilverfishLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}
				}
			break;
		case SKELETON:
			Droploot = simpleloot.this.getConfig().getString("SkeletonsDropLoot");
			loot = simpleloot.this.getConfig().getInt("SkeletonLoot");
			qty = simpleloot.this.getConfig().getInt("SkeletonLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("SkeletonLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));   					
					}
				}
			break;
		case SLIME:
			Droploot = simpleloot.this.getConfig().getString("SlimeDropLoot");
			loot = simpleloot.this.getConfig().getInt("SlimeLoot");
			qty = simpleloot.this.getConfig().getInt("SlimeLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("SlimeLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}					
				}			
			break;
		case SPIDER:
			Droploot = simpleloot.this.getConfig().getString("SpidersDropLoot");
			loot = simpleloot.this.getConfig().getInt("SpiderLoot");
			qty = simpleloot.this.getConfig().getInt("SpiderLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("SpiderLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}
				}			
			break;
		case WITCH:
			Droploot = simpleloot.this.getConfig().getString("WitchsDropLoot");
			loot = simpleloot.this.getConfig().getInt("WitchLoot");
			qty = simpleloot.this.getConfig().getInt("WitchLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("WitchLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}					
				}
			break;
		case ZOMBIE:
			Droploot = simpleloot.this.getConfig().getString("ZombiesDropLoot");
			loot = simpleloot.this.getConfig().getInt("ZombieLoot");
			qty = simpleloot.this.getConfig().getInt("ZombieLootQTY");
				if(qty>0 && Droploot=="true"){
					int percent = simpleloot.this.getConfig().getInt("ZombieLootChance");
					Random rand = new Random();
					if(rand.nextInt(100)<=percent){
						killer.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
						e.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					}					
				}
			break;
		default:
			break;
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
        if (b.getTypeId() == 31 && data==1 && simpleloot.this.getConfig().getString("GrassDropsLoot")=="true") {
    		int percent = simpleloot.this.getConfig().getInt("GrassLootChance");
			Random rand = new Random();
			// check to see if they're lucky
			if(rand.nextInt(100)<=percent){    			
				// dispense prize
    			p.playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
                event.setCancelled(true);
                int loot = simpleloot.this.getConfig().getInt("GrassLoot");
    			int qty = simpleloot.this.getConfig().getInt("GrassLootQTY");
                b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
                b.setType(Material.AIR);
				}
            }
        }

}
