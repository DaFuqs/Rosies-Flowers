package me.sria.srias_flowers;

import net.fabricmc.fabric.api.biome.v1.*;
import net.fabricmc.fabric.api.tag.convention.v1.*;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;

public class SriasPlacedFeatures {
	
	public static RegistryKey<PlacedFeature> SUNRISE_DAISY = of("sunrise_daisy");
	public static RegistryKey<PlacedFeature> HIMALAYAN_POPPY = of("himalayan_poppy");
	public static RegistryKey<PlacedFeature> BLUE_HYDRANGEA = of("blue_hydrangea");
	public static RegistryKey<PlacedFeature> SEEDING_DANDELION = of("seeding_dandelion");
	public static RegistryKey<PlacedFeature> FLEABANE = of("fleabane");
	public static RegistryKey<PlacedFeature> DUNE_GRASS = of("dune_grass");
	public static RegistryKey<PlacedFeature> ALOE_VERA = of("aloe_vera");
	public static RegistryKey<PlacedFeature> CHACONIA = of("chaconia");
	public static RegistryKey<PlacedFeature> PERIWINKLE = of("periwinkle");
	public static RegistryKey<PlacedFeature> WHITE_PERIWINKLE = of("white_periwinkle");
	public static RegistryKey<PlacedFeature> PURPLE_PERIWINKLE = of("purple_periwinkle");
	public static RegistryKey<PlacedFeature> SCARLET_FLAX_COMMON = of("scarlet_flax_common");
	public static RegistryKey<PlacedFeature> SCARLET_FLAX_RARE = of("scarlet_flax_rare");
	
	public static RegistryKey<PlacedFeature> DOGWOOD_TREES = of("dogwood_trees");
	public static RegistryKey<PlacedFeature> BLUE_WISTERIA_TREES = of("blue_wisteria_trees");
	public static RegistryKey<PlacedFeature> PURPLE_WISTERIA_TREES = of("purple_wisteria_trees");
	
	public static RegistryKey<PlacedFeature> of(String id) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, SriasFlowers.id(id));
	}
	
	static void addBiomeModifications() {
		BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_HILL), GenerationStep.Feature.VEGETAL_DECORATION, HIMALAYAN_POPPY);
		BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, SEEDING_DANDELION);
		BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, FLEABANE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT), GenerationStep.Feature.VEGETAL_DECORATION, DUNE_GRASS);
		BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT), GenerationStep.Feature.VEGETAL_DECORATION, ALOE_VERA);
		BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, CHACONIA);
		BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, SCARLET_FLAX_RARE);
		
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, FLEABANE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, BLUE_HYDRANGEA);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, DOGWOOD_TREES);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, BLUE_WISTERIA_TREES);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, PURPLE_WISTERIA_TREES);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, SCARLET_FLAX_COMMON);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, PERIWINKLE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, WHITE_PERIWINKLE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, PURPLE_PERIWINKLE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, SUNRISE_DAISY);
	}
	
}
