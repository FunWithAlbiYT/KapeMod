package me.funwithalbi.kapemod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import me.funwithalbi.kapemod.init.KapemodModTabs;
import me.funwithalbi.kapemod.init.KapemodModItems;
import me.funwithalbi.kapemod.init.KapemodModFluids;
import me.funwithalbi.kapemod.init.KapemodModFeatures;
import me.funwithalbi.kapemod.init.KapemodModBlocks;
import me.funwithalbi.kapemod.init.KapemodModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("kapemod")
public class KapemodMod {
	public static final Logger LOGGER = LogManager.getLogger(KapemodMod.class);
	public static final String MODID = "kapemod";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public KapemodMod() {
		KapemodModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		KapemodModBlocks.REGISTRY.register(bus);
		KapemodModItems.REGISTRY.register(bus);

		KapemodModFeatures.REGISTRY.register(bus);
		KapemodModFluids.REGISTRY.register(bus);

		KapemodModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
