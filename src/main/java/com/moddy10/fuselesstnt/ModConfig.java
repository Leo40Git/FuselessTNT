package com.moddy10.fuselesstnt;

import org.apache.logging.log4j.Level;

import com.moddy10.fuselesstnt.proxy.CommonProxy;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;

@Config(modid = FuselessTNT.MODID, name = "fuselesstnt", category = ModConfig.CATEGORY_GENERAL)
public class ModConfig {
	
	protected static final String CATEGORY_GENERAL = "general";
	
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e) {
			FuselessTNT.logger.log(Level.ERROR, "Problem loading config file!", e);
		} finally {
			if (cfg.hasChanged())
				cfg.save();
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
	}

}
