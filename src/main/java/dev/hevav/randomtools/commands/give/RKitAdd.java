package dev.hevav.randomtools.commands.give;

import dev.hevav.randomtools.RandomTools;
import dev.hevav.randomtools.helpers.GiveHelper;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RKitAdd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length < 3)
            return false;
        List<HashMap<String, String>> toGive = new ArrayList<>();
        for (int i = 1; i < strings.length; i++) {
            toGive.add(GiveHelper.parseMap(strings[i]));
        }
        RandomTools.config.set(String.format("kits.%s", strings[0]), toGive);
        return true;
    }
}
