// Program that allows the user to convert temperatures from Celsius to Fahrenheit

import javax.swing.JOptionPane;

public class TempConvertJOS {

	public static void main(String[] args) {
		String input;
		String output;
		double celsius;
		double fahrenheit;
	
		// Input is entered in Celsius
		input = JOptionPane.showInputDialog("Enter a temperature in Celsius °C to be converted to Fahrenheit °F");
		celsius = Double.parseDouble(input);

		// Input in Celsius is converted to Fahrenheit
		fahrenheit = celsius * 9 / 5 + 32;

		// Output in Fahrenheit to 4 decimal places
		output = String.format("%f Celsius °C is %.4f Fahrenheit °F", celsius, fahrenheit);
		JOptionPane.showMessageDialog(null, output);

	}

}
