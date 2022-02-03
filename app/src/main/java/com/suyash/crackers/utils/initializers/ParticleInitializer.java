package com.suyash.crackers.utils.initializers;

import com.suyash.crackers.utils.Particle;

import java.util.Random;

public interface ParticleInitializer {

	void initParticle(Particle p, Random r);

}
