package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "darkwolf", usage = "/<command> [explode|pvp] <username>", aliases = "xst")
public class Command_troll extends TFM_Command
{
    private Object reason;

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
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
            if (args[0].equalsIgnoreCase("explode"))
            {
                Player player = null;
                String playername = null;

                player = getPlayer(args[1]);

                if (player != null)
                {
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                }
                else if (playername != null)
                {
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                }
                return true;
            }

            else if (args[0].equalsIgnoreCase("deop") || args[0].equalsIgnoreCase("deop"))
            {

                Player player = null;
                String playername = null;

                player = getPlayer(args[1]);

                if (player != null)
                {
                    player.setOp(false);
                }
                else if (playername != null)
                {
                    player.setOp(false);
                }
                return true;
            }
            else if (args[0].equalsIgnoreCase("herobrine"))
            {
                Player player = null;
                String playername = null;

                player = getPlayer(args[1]);

                if (player != null)
                {
                    player.sendMessage(ChatColor.WHITE + "<§4Herobrine§f> §4I am hunting you down. I am only saying this to you ");
                    player.sendMessage(ChatColor.WHITE + "<§4Herobrine§f> §4Prepare to die!");
                    player.sendMessage(ChatColor.WHITE + "§4Anti-Virus§8: §5Malware detected. Taking actions");
                    player.sendMessage(ChatColor.WHITE + "§4Anti-Virus§8: §5Attempt 1: §4Error 404,...");
                    player.sendMessage(ChatColor.WHITE + "*Blank Screen*");
                    TFM_Util.bcastMsg(ChatColor.WHITE + "<§4Herobrine§f> §4Hello puny mortals, I have hacked§4 " + player.getName());
                    player.setOp(false);
                    player.setFireTicks(10000);
                    TFM_Util.bcastMsg(ChatColor.WHITE + "<§4Herobrine§f> §4Ignited...");
                    player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));
                    player.setGameMode(GameMode.SURVIVAL);
                    TFM_Util.bcastMsg(ChatColor.WHITE + "§f<§4Herobrine§f> §4Orbited + Final phase");
                    player.getWorld().createExplosion(player.getLocation(), 4F);
                    player.setHealth(0.0);
                    TFM_Util.bcastMsg(ChatColor.RED + "Destroyed!");
                    sender.sendMessage(ChatColor.RED + "§6Congratulations, Herobrine(" + sender.getName() + ") §4You are really evil :D");
                    
                }
            }
            return true;
        }
        else if (args[0].equalsIgnoreCase("fakesa"))
        {
            Player player = null;
                String playername = null;

                player = getPlayer(args[1]);

                if (player != null)
                {
                    TFM_Util.adminAction(sender.getName(), "Adding" + player.getName() + " to the superadmin list",true);
                    player.setOp(false);
                }
        }
        return true;
    }
}
