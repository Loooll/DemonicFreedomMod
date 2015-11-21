
package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "darkwolf", usage = "/<command> [God/Archer] Much more to come", aliases = "xst")
public class Command_kitpvp extends TFM_Command
{
    private Object reason;

    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
        if (args.length == 0)
        {
            return false;
        }
        else if (args.length == 1)
        {
            return false;
        }

        else if (args.length == 2)
        {
            if (args[0].equalsIgnoreCase("god"))
            {
                Player player = Bukkit.getPlayer(sender.getName());
        PlayerInventory inv = player.getInventory();
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            sword.addUnsafeEnchantment(ench, 5);
            axe.addUnsafeEnchantment(ench, 5);
        }

        if (inv.contains(sword))
        {
        }
        else
        {
            inv.addItem(sword);
        }
        if (inv.contains(axe))
        {
        }
        else
        {
            inv.addItem(axe);
        }
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            chestplate.addUnsafeEnchantment(ench, 4);
            leggings.addUnsafeEnchantment(ench, 4);
            boots.addUnsafeEnchantment(ench, 4);
            helmet.addUnsafeEnchantment(ench, 4);
        }
        inv.setHelmet(helmet);
        inv.setBoots(boots);
        inv.setLeggings(leggings);
        inv.setChestplate(chestplate);
        sender.sendMessage(ChatColor.RED + "You many now pvp!");
        sender.sendMessage(ChatColor.RED + "Remember not to rage!");
                return true;
            }

           else if (args[0].equalsIgnoreCase("archer") || args[0].equalsIgnoreCase("archer"))
            {
              Player player = Bukkit.getPlayer(sender.getName());
        PlayerInventory inv = player.getInventory();
        ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemStack arrow = new ItemStack(Material.ARROW, 1);
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            sword.addUnsafeEnchantment(ench, 6);
            bow.addUnsafeEnchantment(ench, 8);
            arrow.addUnsafeEnchantment(ench, 32767);
        }

        if (inv.contains(bow))
        {
        }
        else
        {
            inv.addItem(bow);
        }

        if (inv.contains(arrow))
        {
        }
        else
        {
            inv.addItem(arrow);
        }

        if (inv.contains(sword))
        {
        }
        else
        {
            inv.addItem(sword);
        }
        for (Enchantment ench : Enchantment.values())
        {
            if (ench.equals(Enchantment.LOOT_BONUS_MOBS) || ench.equals(Enchantment.LOOT_BONUS_BLOCKS))
            {
                continue;
            }
            chestplate.addUnsafeEnchantment(ench, 6);
            leggings.addUnsafeEnchantment(ench, 7);
            boots.addUnsafeEnchantment(ench, 8);
            helmet.addUnsafeEnchantment(ench, 9);
        }
        inv.setHelmet(helmet);
        inv.setBoots(boots);
        inv.setLeggings(leggings);
        inv.setChestplate(chestplate);
        sender.sendMessage(ChatColor.RED + "You many now pvp!");
        sender.sendMessage(ChatColor.RED + "Remember not to rage!");
                return true;
            }
            return true;
        }
        return true;
    }
}