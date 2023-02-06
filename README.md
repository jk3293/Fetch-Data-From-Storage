# Fetch-Data-From-Storage
Fetch Data From Storage
Easily access any files, including music, images, and video.
We have use most recent code does not use any deprication methods or values.
This code tested and verified all devices in SDK versions 21 to 33.
The main pros of this code are that it can scan and retrieve thousands of files in less than a second.
The depancancy size is too small, and it's easy to implement.


Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency
dependencies {
    ...
	 implementation 'com.github.jk3293:Fetch-Data-From-Storage:Tag'
	}
