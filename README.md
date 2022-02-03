Crackersanimator is a particle system library that works with the standard Android UI.


Android Studio / gradle
Add the following dependency to the build.gradle of your project

dependencies {
	        implementation 'com.github.Suyash171:crackersanimator:Tag'
	}
  
 Add it in your root build.gradle at the end of repositories:
 
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Creating and firing a one-shot particle system is very easy, just 3 lines of code.
  
  new ParticleSystem(this, numParticles, drawableResId, timeToLive)
.setSpeedRange(0.2f, 0.5f)
.oneShot(anchorView, numParticles);


Finally, we call oneShot, passing the view from which the particles will be launched and saying how many particles we want to be shot.



Emitters
You can configure emitters, which have a constant ratio of particles being emited per second. This is the code for the Confeti example

