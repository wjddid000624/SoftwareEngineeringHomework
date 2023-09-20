package edu.yonsei.csi3106.homework1;

class EmptyException extends Exception {
	public EmptyException() {
		super("No such account found.");
	}
}