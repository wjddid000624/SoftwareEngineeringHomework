package edu.yonsei.csi3106.homework1;

class NotEnoughException extends Exception {
	public NotEnoughException() {
		super("Insufficient account balance.");
	}
}