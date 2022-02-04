# Crackersanimator

Crackersanimator is a particle system library that works with the standard Android UI.
This library build from https://github.com/plattysoft/Leonids library but make some update to support for latest version of android.

Android Studio / gradle
Add the following dependency to the build.gradle of your project



2. Add the Crackersanimator dependency

	```javascript
	dependencies {
	        implementation 'com.github.Suyash171:crackersanimator:Tag'
	}
  

 
## Download
### Gradle

1. Define the jitpack remote Maven repository inside the repositories block of your root `build.gradle` file

 ```javascript
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
   ```
   
  Creating and firing a one-shot particle system is very easy, just 3 lines of code.
 
# Usage
```java
new ParticleSystem(this, numParticles, drawableResId, timeToLive)
.setSpeedRange(0.2f, 0.5f)
.oneShot(anchorView, numParticles);


Finally, we call oneShot, passing the view from which the particles will be launched and saying how many particles we want to be shot.



Emitters
You can configure emitters, which have a constant ratio of particles being emited per second. This is the code for the Confeti example

# Author

[Suyash Raikar](https://github.com/Suyash171)


# Credits
