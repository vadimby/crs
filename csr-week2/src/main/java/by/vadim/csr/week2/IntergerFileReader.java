package by.vadim.csr.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class IntergerFileReader {

	public int[] read(String fileName) {
		List<Integer> result = new ArrayList<Integer>();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(IntergerFileReader.class.getResourceAsStream(fileName)))) {
			String thisLine;

			while ((thisLine = br.readLine()) != null) {
				result.add(Integer.parseInt(thisLine));
			}
		} catch (IOException e) {
			System.err.println("Error: " + e);
		} catch (NumberFormatException e) {
			System.err.println("Invalid number");
		}
		return ArrayUtils.toPrimitive(result.toArray(new Integer[0]));
	}

}
