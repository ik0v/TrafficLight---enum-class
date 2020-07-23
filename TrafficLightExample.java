enum TrafficLight {

	red(true), yellow(false), green(false);

	private boolean on;
	private TrafficLight(boolean on) {
		this.on = on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public String toString() {
		return super.toString() + " (" + on + ")";
	}

	public static void printTrafficLights() {
		for(TrafficLight i: TrafficLight.values()) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void setOn(String lightOn) {
		TrafficLight lightSetOn = TrafficLight.valueOf(lightOn);
		for(TrafficLight i: TrafficLight.values()) {
			if(lightSetOn == i) {
				i.setOn(true);
			} else {
				i.setOn(false);
			}
		}
	}

}


class TrafficLightExample {
	public static void main(String[] args) {

		TrafficLight.printTrafficLights();
		TrafficLight.setOn("yellow");
		TrafficLight.printTrafficLights();
		TrafficLight.setOn("green");
		TrafficLight.printTrafficLights();

	}
}