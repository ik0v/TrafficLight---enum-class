import static javax.swing.JOptionPane.*;

enum TrafficLight {

	red(true), yellow(false), green(false);

	static {
		System.out.println("Example of traffic light function: ");
	}

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

	public static String allColors() {
		String result = "";
		for(TrafficLight i: TrafficLight.values()) {
			result += i.name() + " ";
		}
		return result;
	}

	public static void setOn(String colorName) {
		TrafficLight lightSetOn = checkColor(colorName);
		for(TrafficLight i: TrafficLight.values()) {
			if(lightSetOn == i) {
				i.setOn(true);
			} else {
				i.setOn(false);
			}
		}
	}

	private static TrafficLight checkColor(String colorName) {
		boolean colorOk = false;
		while(!colorOk){
			try {
				TrafficLight.valueOf(colorName);
				colorOk = true;
			} catch(IllegalArgumentException e) {
				String errMessage = "Wrong color was used ('" + colorName
									+ "') \nPlease enter valid traffic light color: " + allColors();
				colorName = showInputDialog(errMessage);
			}
		}
		return TrafficLight.valueOf(colorName);
	}
}


class TrafficLightExample {
	public static void main(String[] args) {

		TrafficLight.printTrafficLights();
		TrafficLight.setOn(showInputDialog("Choose light to switch on :"));
		TrafficLight.printTrafficLights();

	}
}