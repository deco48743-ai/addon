package dev.nightfinder;

import com.mojang.logging.LogUtils;
import dev.nightfinder.modules.NightFinderModule;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public final class NightFinderAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Asian Rice Finder");

    @Override public void onInitialize() {
        LOG.info("Initializing Asian Rice Finder");
        Modules.get().add(new NightFinderModule());
    }

    @Override public void onRegisterCategories() { Modules.registerCategory(CATEGORY); }
    @Override public String getPackage() { return "dev.nightfinder"; }
}
