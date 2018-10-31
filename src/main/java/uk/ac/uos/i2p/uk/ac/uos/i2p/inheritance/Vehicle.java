package uk.ac.uos.i2p.uk.ac.uos.i2p.inheritance;

class Vehicle {

	private int wheels;

	protected Vehicle(int wheels) {
		this.wheels = wheels;
	}

	public void describe() {
		System.out.println("Vehicle with " + wheels + " wheels");
	}
}
