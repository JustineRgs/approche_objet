package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] array;
	private int size;

	public CalculMoyenne() {
		this.array = new double[1];
		this.size = 0;
	}

	public void add(double number) {
		if (size == array.length) {
			array = Arrays.copyOf(array, size * 2);
		}
		array[size++] = number;
	}

	public double calc() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		return sum / size;
	}
}
