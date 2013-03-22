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
			int chance;
			Random rand= new Random();
			//Location loc = e.getLocation();
		//Check the mob type
		switch(e.getType()){
		case BAT:
			Droploot=simpleloot.this.getConfig().getString("BatDropLoot");
			loot=simpleloot.this.getConfig().getInt("BatLoot");
			qty=simpleloot.this.getConfig().getInt("BatLootQTY");
			chance=simpleloot.this.getConfig().getInt("BatLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case BLAZE:
			Droploot=simpleloot.this.getConfig().getString("BlazeDropLoot");
			loot=simpleloot.this.getConfig().getInt("BlzeLoot");
			qty=simpleloot.this.getConfig().getInt("BlazeLootQTY");
			chance=simpleloot.this.getConfig().getInt("BlazeLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case CAVE_SPIDER:
			Droploot=simpleloot.this.getConfig().getString("CaveSpidersDropLoot");
			loot=simpleloot.this.getConfig().getInt("CaveSpidersLoot");
			qty=simpleloot.this.getConfig().getInt("CaveSpidersLootQTY");
			chance=simpleloot.this.getConfig().getInt("CaveSpidersLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case CHICKEN:
			Droploot=simpleloot.this.getConfig().getString("ChickenDropLoot");
			loot=simpleloot.this.getConfig().getInt("ChickenLoot");
			qty=simpleloot.this.getConfig().getInt("ChickenLootQTY");
			chance=simpleloot.this.getConfig().getInt("ChickenLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case COW:
			Droploot=simpleloot.this.getConfig().getString("CowDropLoot");
			loot=simpleloot.this.getConfig().getInt("CowLoot");
			qty=simpleloot.this.getConfig().getInt("CowLootQTY");
			chance=simpleloot.this.getConfig().getInt("CowLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case CREEPER:
			Droploot=simpleloot.this.getConfig().getString("CreeperDropLoot");
			loot=simpleloot.this.getConfig().getInt("CreeperLoot");
			qty=simpleloot.this.getConfig().getInt("CreeperLootQTY");
			chance=simpleloot.this.getConfig().getInt("CreeperLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case ENDERMAN:
			Droploot=simpleloot.this.getConfig().getString("EndermenDropLoot");
			loot=simpleloot.this.getConfig().getInt("EndermenLoot");
			qty=simpleloot.this.getConfig().getInt("EndermenLootQTY");
			chance=simpleloot.this.getConfig().getInt("EndermenLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case ENDER_DRAGON:
			Droploot=simpleloot.this.getConfig().getString("EnderDragonDropLoot");
			loot=simpleloot.this.getConfig().getInt("EnderDragonLoot");
			qty=simpleloot.this.getConfig().getInt("EnderDragonLootQTY");
			chance=simpleloot.this.getConfig().getInt("EnderDragonLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case GHAST:
			Droploot=simpleloot.this.getConfig().getString("GhastDropLoot");
			loot=simpleloot.this.getConfig().getInt("GhastLoot");
			qty=simpleloot.this.getConfig().getInt("GhastLootQTY");
			chance=simpleloot.this.getConfig().getInt("GhastLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case GIANT:
			Droploot=simpleloot.this.getConfig().getString("GiantDropLoot");
			loot=simpleloot.this.getConfig().getInt("GiantLoot");
			qty=simpleloot.this.getConfig().getInt("GiantLootQTY");
			chance=simpleloot.this.getConfig().getInt("GiantLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case IRON_GOLEM:
			Droploot=simpleloot.this.getConfig().getString("IronGolemDropLoot");
			loot=simpleloot.this.getConfig().getInt("IronGolemLoot");
			qty=simpleloot.this.getConfig().getInt("IronGolemLootQTY");
			chance=simpleloot.this.getConfig().getInt("IronGolemLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case MAGMA_CUBE:
			Droploot=simpleloot.this.getConfig().getString("MagmaCubeDropLoot");
			loot=simpleloot.this.getConfig().getInt("MagmaCubeLoot");
			qty=simpleloot.this.getConfig().getInt("MagmaCubeLootQTY");
			chance=simpleloot.this.getConfig().getInt("MagmaCubeLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case MUSHROOM_COW:			
			Droploot=simpleloot.this.getConfig().getString("MushroomCowDropLoot");
			loot=simpleloot.this.getConfig().getInt("MushroomCowLoot");
			qty=simpleloot.this.getConfig().getInt("MushroomCowLootQTY");
			chance=simpleloot.this.getConfig().getInt("MushroomCowLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case OCELOT:
			Droploot=simpleloot.this.getConfig().getString("OcelotDropLoot");
			loot=simpleloot.this.getConfig().getInt("OcelotLoot");
			qty=simpleloot.this.getConfig().getInt("OcelotLootQTY");
			chance=simpleloot.this.getConfig().getInt("OcelotLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case PIG:
			Droploot=simpleloot.this.getConfig().getString("PigDropLoot");
			loot=simpleloot.this.getConfig().getInt("PigLoot");
			qty=simpleloot.this.getConfig().getInt("PigLootQTY");
			chance=simpleloot.this.getConfig().getInt("PigLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case PIG_ZOMBIE:
			Droploot=simpleloot.this.getConfig().getString("PigmenDropLoot");
			loot=simpleloot.this.getConfig().getInt("PigmenLoot");
			qty=simpleloot.this.getConfig().getInt("PigmenLootQTY");
			chance=simpleloot.this.getConfig().getInt("PigmenLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case PLAYER:

			Droploot=simpleloot.this.getConfig().getString("PlayerDropLoot");
			loot=simpleloot.this.getConfig().getInt("PlayerLoot");
			qty=simpleloot.this.getConfig().getInt("PlayerLootQTY");
			chance=simpleloot.this.getConfig().getInt("PlayerLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SHEEP:
			Droploot=simpleloot.this.getConfig().getString("SheepDropLoot");
			loot=simpleloot.this.getConfig().getInt("SheepLoot");
			qty=simpleloot.this.getConfig().getInt("SheepLootQTY");
			chance=simpleloot.this.getConfig().getInt("SheepLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SILVERFISH:
			Droploot=simpleloot.this.getConfig().getString("SilverfishDropLoot");
			loot=simpleloot.this.getConfig().getInt("SilverfishLoot");
			qty=simpleloot.this.getConfig().getInt("SilverfishLootQTY");
			chance=simpleloot.this.getConfig().getInt("SilverfishLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SKELETON:
			Droploot=simpleloot.this.getConfig().getString("SkeletonDropLoot");
			loot=simpleloot.this.getConfig().getInt("SkeletonLoot");
			qty=simpleloot.this.getConfig().getInt("SkeletonLootQTY");
			chance=simpleloot.this.getConfig().getInt("SkeletonLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SLIME:
			Droploot=simpleloot.this.getConfig().getString("SlimeDropLoot");
			loot=simpleloot.this.getConfig().getInt("SlimeLoot");
			qty=simpleloot.this.getConfig().getInt("SlimeLootQTY");
			chance=simpleloot.this.getConfig().getInt("SlimeLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;	
		case SNOWMAN:
			Droploot=simpleloot.this.getConfig().getString("SnowmanDropLoot");
			loot=simpleloot.this.getConfig().getInt("SnowmanLoot");
			qty=simpleloot.this.getConfig().getInt("SnowmanootQTY");
			chance=simpleloot.this.getConfig().getInt("SnowmanLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SPIDER:
			Droploot=simpleloot.this.getConfig().getString("SpiderDropLoot");
			loot=simpleloot.this.getConfig().getInt("SpiderLoot");
			qty=simpleloot.this.getConfig().getInt("SpiderLootQTY");
			chance=simpleloot.this.getConfig().getInt("SpiderLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case SQUID:
			Droploot=simpleloot.this.getConfig().getString("SquidDropLoot");
			loot=simpleloot.this.getConfig().getInt("SquidLoot");
			qty=simpleloot.this.getConfig().getInt("SquidLootQTY");
			chance=simpleloot.this.getConfig().getInt("SquidLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;		
		case VILLAGER:
			Droploot=simpleloot.this.getConfig().getString("VillagerDropLoot");
			loot=simpleloot.this.getConfig().getInt("VillagerLoot");
			qty=simpleloot.this.getConfig().getInt("VillagerLootQTY");
			chance=simpleloot.this.getConfig().getInt("VillagerLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;		
		case WITCH:
			Droploot=simpleloot.this.getConfig().getString("WitchDropLoot");
			loot=simpleloot.this.getConfig().getInt("WitchLoot");
			qty=simpleloot.this.getConfig().getInt("WitchLootQTY");
			chance=simpleloot.this.getConfig().getInt("WitchLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case WITHER:
			Droploot=simpleloot.this.getConfig().getString("WitherDropLoot");
			loot=simpleloot.this.getConfig().getInt("WitherLoot");
			qty=simpleloot.this.getConfig().getInt("WitherLootQTY");
			chance=simpleloot.this.getConfig().getInt("WitherLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;	
		case WOLF:
			Droploot=simpleloot.this.getConfig().getString("WolfDropLoot");
			loot=simpleloot.this.getConfig().getInt("WolfLoot");
			qty=simpleloot.this.getConfig().getInt("WolfLootQTY");
			chance=simpleloot.this.getConfig().getInt("WolfLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
			}
			break;
		case ZOMBIE:
			Droploot=simpleloot.this.getConfig().getString("ZombieDropLoot");
			loot=simpleloot.this.getConfig().getInt("ZombieLoot");
			qty=simpleloot.this.getConfig().getInt("ZombieLootQTY");
			chance=simpleloot.this.getConfig().getInt("ZombieLootChance");
			if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					event.getDrops().add(new ItemStack(Material.getMaterial(loot),qty));
					event.getEntity().getWorld().playSound(event.getEntity().getLocation(), org.bukkit.Sound.ORB_PICKUP, 1, 5);
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
		String configcheck = simpleloot.this.getConfig().getString("PlantsDropLoot");		
		if(configcheck=="true"){
		Block b=event.getBlock();
		String Droploot;
		Location loc = b.getLocation();
		int loot;
		int qty;
		int chance;
		Random rand= new Random();       
			switch(b.getType()){		
			case BROWN_MUSHROOM:
				Droploot=simpleloot.this.getConfig().getString("BrownMushroomDropLoot");
				loot=simpleloot.this.getConfig().getInt("BrownMushroomLoot");
				qty=simpleloot.this.getConfig().getInt("BrownMushroomQTY");
				chance=simpleloot.this.getConfig().getInt("BrownMushroomLootChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;
			case DEAD_BUSH:
				Droploot=simpleloot.this.getConfig().getString("DeadBushDropLoot");
				loot=simpleloot.this.getConfig().getInt("DeadBushLoot");
				qty=simpleloot.this.getConfig().getInt("DeadBushQTY");
				chance=simpleloot.this.getConfig().getInt("DeadBushLootChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;
			case LONG_GRASS:
				Droploot=simpleloot.this.getConfig().getString("LongGrassDropLoot");
				loot=simpleloot.this.getConfig().getInt("LongGrassLoot");
				qty=simpleloot.this.getConfig().getInt("LongGrassQTY");
				chance=simpleloot.this.getConfig().getInt("LongGrassChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;			
			case RED_MUSHROOM:
				Droploot=simpleloot.this.getConfig().getString("RedMushroomDropLoot");
				loot=simpleloot.this.getConfig().getInt("RedMushroomLoot");
				qty=simpleloot.this.getConfig().getInt("RedMushroomQTY");
				chance=simpleloot.this.getConfig().getInt("RedMushroomLootChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;
			case RED_ROSE:
				Droploot=simpleloot.this.getConfig().getString("RedRoseDropLoot");
				loot=simpleloot.this.getConfig().getInt("RedRoseLoot");
				qty=simpleloot.this.getConfig().getInt("RedRoseQTY");
				chance=simpleloot.this.getConfig().getInt("RedRoseLootChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;
			case YELLOW_FLOWER:
				Droploot=simpleloot.this.getConfig().getString("YellowFlowerDropLoot");
				loot=simpleloot.this.getConfig().getInt("YellowFlowerLoot");
				qty=simpleloot.this.getConfig().getInt("YellowFlowerQTY");
				chance=simpleloot.this.getConfig().getInt("YellowFlowerLootChance");
				if(Droploot.equalsIgnoreCase("true")&&qty!=0&&rand.nextInt(100)<chance){
					b.getWorld().dropItemNaturally(loc,new ItemStack(loot,qty));
					b.getWorld().playSound(loc, org.bukkit.Sound.ORB_PICKUP, 1, 5);
				}
				break;
			default:
				break;
            }
        }
	}
}
