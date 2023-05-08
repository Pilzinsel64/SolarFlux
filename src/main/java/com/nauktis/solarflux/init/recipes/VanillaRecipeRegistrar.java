package com.nauktis.solarflux.init.recipes;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.google.common.collect.Lists;
import com.nauktis.solarflux.init.ModBlocks;
import com.nauktis.solarflux.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class VanillaRecipeRegistrar extends AbstractRecipeRegistrar {

    @Override
    public void registerRecipes() {
        registerCellRecipes();
        registerSolarPanelRecipes();
        registerUpgradeRecipes();
    }

    protected void registerCellRecipes() {
        registerMirrorRecipe();
        registerCell1Recipe();
        registerCell2Recipe();
        registerCell3Recipe();
        registerCell4Recipe();
    }

    protected void registerSolarPanelRecipes() {
        if (ModBlocks.getSolarPanels()
            .size() > 0) {
            registerSolarPanel0();
        }
        if (ModBlocks.getSolarPanels()
            .size() > 1) {
            registerSolarPanel1();
        }
        if (ModBlocks.getSolarPanels()
            .size() > 2) {
            registerSolarPanel2();
        }
        if (ModBlocks.getSolarPanels()
            .size() > 3) {
            registerSolarPanel3();
        }
        if (ModBlocks.getSolarPanels()
            .size() > 4) {
            registerSolarPanel4();
        }
        if (ModBlocks.getSolarPanels()
            .size() > 5) {
            registerSolarPanel5();
        }
        for (int tier = 6; tier < ModBlocks.getSolarPanels()
            .size(); ++tier) {
            registerSolarPanel(tier);
        }
    }

    protected void registerUpgradeRecipes() {
        if (ModItems.mUpgradeBlank != null) {
            registerUpgradeBlank();
        }
        if (ModItems.mUpgradeEfficiency != null) {
            registerUpgradeEfficiency();
        }
        if (ModItems.mUpgradeLowLight != null) {
            registerUpgradeLowLight();
        }
        if (ModItems.mUpgradeTraversal != null) {
            registerUpgradeTraversal();
        }
        if (ModItems.mUpgradeTransferRate != null) {
            registerUpgradeTransferRate();
        }
        if (ModItems.mUpgradeCapacity != null) {
            registerUpgradeCapacity();
        }
        if (ModItems.mUpgradeFurnace != null) {
            registerUpgradeFurnace();
        }
    }

    protected void registerMirrorRecipe() {
        List<String> metals = Lists.newArrayList("ingotIron");
        if (knowsOre("ingotTin")) {
            metals.add("ingotTin");
        }
        if (knowsOre("ingotAluminum")) {
            metals.add("ingotAluminum");
        }
        if (knowsOre("ingotAluminium")) {
            metals.add("ingotAluminium");
        }
        for (String metal : metals) {
            GameRegistry.addRecipe(
                new ShapedOreRecipe(new ItemStack(ModItems.mMirror, 2), "ggg", " i ", 'g', "paneGlass", 'i', metal));
        }
    }

    protected void registerCell1Recipe() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mSolarCell1,
                "gmg",
                "lml",
                "   ",
                'g',
                "paneGlass",
                'l',
                "gemLapis",
                'm',
                ModItems.mMirror));
    }

    protected void registerCell2Recipe() {
        //@formatter:off
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.mSolarCell2, "cmc", "lsl", "   ", 'c', Items.clay_ball, 'l', "gemLapis", 'm', ModItems.mMirror, 's', ModItems.mSolarCell1));
        //@formatter:on
    }

    protected void registerCell3Recipe() {
        //@formatter:off
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.mSolarCell3, "ogo", "lcl", "   ", 'g', "blockGlass", 'l', "dustGlowstone", 'o', Blocks.obsidian, 'c', ModItems.mSolarCell2));
        //@formatter:on
    }

    protected void registerCell4Recipe() {
        //@formatter:off
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.mSolarCell4, "obo", "qcq", "   ", 'b', Items.blaze_rod, 'o', Blocks.obsidian, 'q', "gemQuartz", 'c', ModItems.mSolarCell3));
        //@formatter:on
    }

    protected void registerSolarPanel0() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(0),
                "mrm",
                "prp",
                "   ",
                'm',
                ModItems.mMirror,
                'p',
                "plankWood",
                'r',
                "dustRedstone"));
    }

    protected void registerSolarPanel1() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(1),
                "rsr",
                "gpg",
                "   ",
                's',
                ModBlocks.getSolarPanels()
                    .get(0),
                'p',
                Blocks.piston,
                'g',
                getFirstOreAvailable("ingotCopper", "ingotIron"),
                'r',
                "dustRedstone"));
    }

    protected void registerSolarPanel2() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(2),
                "gsp",
                "rbr",
                "   ",
                'p',
                ModItems.mSolarCell1,
                's',
                ModBlocks.getSolarPanels()
                    .get(1),
                'c',
                Items.repeater,
                'b',
                getFirstOreAvailable("ingotCopper", "ingotIron"),
                'g',
                "nuggetGold",
                'r',
                "dustRedstone"));
    }

    protected void registerSolarPanel3() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(3),
                "gsp",
                "rbr",
                "   ",
                'p',
                ModItems.mSolarCell2,
                's',
                ModBlocks.getSolarPanels()
                    .get(2),
                'c',
                Items.clock,
                'b',
                getFirstOreAvailable("ingotCopper", "ingotIron"),
                'g',
                "ingotGold",
                'r',
                "dustRedstone"));
    }

    protected void registerSolarPanel4() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(4),
                "gsp",
                "rbr",
                "   ",
                'p',
                ModItems.mSolarCell3,
                's',
                ModBlocks.getSolarPanels()
                    .get(3),
                'b',
                getFirstOreAvailable("blockCopper", "blockIron"),
                'r',
                "dustRedstone",
                'g',
                "ingotGold"));
    }

    protected void registerSolarPanel5() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(5),
                "gsp",
                "rbm",
                "   ",
                'p',
                ModItems.mSolarCell4,
                's',
                ModBlocks.getSolarPanels()
                    .get(4),
                'b',
                "gemDiamond",
                'r',
                "dustRedstone",
                'g',
                "ingotGold",
                'm',
                getFirstOreAvailable("blockCopper", "blockIron")));
    }

    protected void registerSolarPanel(int pTier) {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModBlocks.getSolarPanels()
                    .get(pTier),
                "gsc",
                "rbm",
                "   ",
                'c',
                ModItems.mSolarCell4,
                's',
                ModBlocks.getSolarPanels()
                    .get(pTier - 1),
                'b',
                "blockDiamond",
                'r',
                "blockRedstone",
                'g',
                "blockGold",
                'm',
                getFirstOreAvailable("blockCopper", "blockIron")));
    }

    protected void registerUpgradeBlank() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeBlank,
                " c ",
                "cmc",
                " c ",
                'c',
                "cobblestone",
                'm',
                ModItems.mMirror));
    }

    protected void registerUpgradeEfficiency() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeEfficiency,
                " c ",
                "cuc",
                " s ",
                'c',
                ModItems.mSolarCell1,
                'u',
                ModItems.mUpgradeBlank,
                's',
                ModItems.mSolarCell2));
    }

    protected void registerUpgradeLowLight() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeLowLight,
                "ggg",
                "lul",
                "ggg",
                'g',
                "paneGlass",
                'u',
                ModItems.mUpgradeBlank,
                'l',
                "dustGlowstone"));
    }

    protected void registerUpgradeTraversal() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeTraversal,
                "i i",
                "rur",
                "i i",
                'i',
                getFirstOreAvailable("ingotAluminum", "ingotAluminium", "ingotTin", "ingotIron"),
                'u',
                ModItems.mUpgradeBlank,
                'r',
                "dustRedstone"));
    }

    protected void registerUpgradeTransferRate() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeTransferRate,
                "rrr",
                "gug",
                "rrr",
                'r',
                "dustRedstone",
                'u',
                ModItems.mUpgradeBlank,
                'g',
                "ingotGold"));
    }

    protected void registerUpgradeCapacity() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeCapacity,
                " r ",
                "rur",
                "rcr",
                'r',
                "dustRedstone",
                'u',
                ModItems.mUpgradeBlank,
                'c',
                "blockRedstone"));
    }

    protected void registerUpgradeFurnace() {
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                ModItems.mUpgradeFurnace,
                "ccc",
                "cuc",
                "cfc",
                'c',
                Items.coal,
                'u',
                ModItems.mUpgradeBlank,
                'f',
                Blocks.furnace));
    }
}
