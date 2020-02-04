package com.simibubi.create;

public class StressConfigDefaults {

	public static double getDefaultStressCapacity(AllBlocks block) {
	
		switch (block) {
		case MOTOR:
			return 1024;
		case MECHANICAL_BEARING:
			return 128;
		case ENCASED_FAN:
		case HAND_CRANK:
			return 64;
		case WATER_WHEEL:
			return 32;
		default:
			return -1;
		}
	}

	public static double getDefaultStressImpact(AllBlocks block) {
	
		switch (block) {
		case CRUSHING_WHEEL:
		case MECHANICAL_PRESS:
			return 32;
	
		case DRILL:
		case SAW:
		case DEPLOYER:
			return 16;
	
		case ENCASED_FAN:
		case MECHANICAL_MIXER:
		case MECHANICAL_BEARING:
		case MECHANICAL_CRAFTER:
			return 8;
	
		case TURNTABLE:
		case MECHANICAL_PISTON:
		case STICKY_MECHANICAL_PISTON:
			return 4;
	
		case BELT:
			return 2;
			
		default:
			return 0;
		}
	}

}