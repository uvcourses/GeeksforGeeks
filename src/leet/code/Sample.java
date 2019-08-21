
public class Sample {

	public static void main(String a[]) {
		String text = "Kforfce";
		StringBuilder sb = new StringBuilder(text);
		int pos[] = new int[50];
		int temp = 0;

		System.out.println("The original string is " + text);

		char character = 'f';

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				pos[temp] = i + temp;
				temp++;
			}
		}

		for (int j = 0; j < temp; j++) {
			sb = sb.insert(pos[j], character);
		}
		System.out.println(" The modifed String is " + sb);

	}

}