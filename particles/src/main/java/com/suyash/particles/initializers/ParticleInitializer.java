package com.suyash.particles.initializers;

import com.suyash.particles.Particle;

import java.util.Random;


public interface ParticleInitializer {

	void initParticle(Particle p, Random r);

}
