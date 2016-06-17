package StringProblems;

public class compressedString {

	public String checkCompressedString(String a) {
		int count = 1;
		StringBuilder builder = new StringBuilder();
		char previous = a.charAt(0);
		for (int i = 1; i < a.length(); i++) {

			char current = a.charAt(i);
			if (previous == current) {

				count++;

			} else {
				builder.append(previous);
				builder.append(count);
				previous = current;
				count = 1;

			}

		}
		builder.append(previous);
		builder.append(count);
		if(a.length()<builder.length()){
			
			return a;
			
		}

		return builder.toString();
	}

}
