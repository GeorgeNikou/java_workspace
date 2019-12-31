import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number between 0-999: ");
		int number = sc.nextInt();
		String toShow = "";
		String numberString = String.valueOf(number);
		int startIndex = 0;
		int endIndex = 1;
		String teenStr = null;

		if (number > 99) {
			String first = numberString.substring(startIndex, endIndex);
			switch (first) {
			case "1": {
				toShow += "One";
				break;
			}
			case "2": {
				toShow += "Two";
				break;
			}
			case "3": {
				toShow += "Three";
				break;
			}
			case "4": {
				toShow += "Four";
				break;
			}
			case "5": {
				toShow += "Five";
				break;
			}
			case "6": {
				toShow += "Six";
				break;
			}
			case "7": {
				toShow += "Seven";
				break;
			}
			case "8": {
				toShow += "Eight";
				break;
			}
			case "9": {
				toShow += "Nine";
				break;
			}
			}
			toShow += " Hundred ";
			startIndex++;
			endIndex++;
		}

		if (number > 9) {
			String second = numberString.substring(startIndex, endIndex);

			switch (second) {
			case "1": {
				teenStr = "teen";
				break;
			}
			case "2": {
				toShow += "Twenty";
				break;
			}
			case "3": {
				toShow += "Thirty";
				break;
			}
			case "4": {
				toShow += "Forty";
				break;
			}
			case "5": {
				toShow += "Fifty";
				break;
			}
			case "6": {
				toShow += "Sixty";
				break;
			}
			case "7": {
				toShow += "Seventy";
				break;
			}
			case "8": {
				toShow += "Eighty";
				break;
			}
			case "9": {
				toShow += "Ninety";
				break;
			}
			}
			startIndex++;
			endIndex++;
		}

		String third = numberString.substring(startIndex, endIndex);
		switch (third) {
		case "0": {
			if (teenStr != null) {
				toShow += "Ten";
				teenStr = null;
			}
			break;
		}
		case "1": {
			if (teenStr != null) {
				toShow += "Eleven";
				teenStr = null;
			} else {
				if (teenStr == null) {
					toShow += "One";
				}

			}
			break;
		}
		case "2": {
			if (teenStr != null) {
				toShow += "Twelve";
				teenStr = null;
			} else {
				toShow += "Two";
			}
			break;
		}
		case "3": {
			if (teenStr != null) {
				toShow += "Thirteen";
				teenStr = null;
			} else {
				toShow += "Three";
			}
			break;
		}
		case "4": {
			toShow += "Four";
			break;
		}
		case "5": {
			if (teenStr != null) {
				toShow += "Fifteen";
				teenStr = null;
			} else {
				toShow += "Five";
			}
			break;
		}
		case "6": {
			toShow += "Six";
			break;
		}
		case "7": {
			toShow += "Seven";
			break;
		}
		case "8": {
			toShow += "Eight";
			break;
		}
		case "9": {
			toShow += "Nine";
			break;
		}
		}

		if (teenStr != null) {
			toShow += teenStr;
		}

		System.out.println(toShow);

	}


	}


