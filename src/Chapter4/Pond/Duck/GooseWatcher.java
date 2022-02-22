package Chapter4.Pond.Duck;

import Chapter4.Pond.Goose.Goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
		goose.floatInWater(); // DOES NOT COMPILE
	}
}