package Chapter4.Pond.Inland;

import Chapter4.Pond.Shore.Bird; // different package than Bird

public class BirdWatcherFromAfar {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); // DOES NOT COMPILE
		System.out.println(bird.text); // DOES NOT COMPILE
	}
}
