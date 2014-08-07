package MarathonArrays;

public class MarathonRunners {
    public static void main(String[] arguments) {
	String[] names = { "Elana", "Thomas", "Hamilton", "Suzie", "Phil",
		"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
		"Daniel", "Neda", "Aaron", "Kate" };

	int[] times = { 343, 273, 248, 329, 445, 402, 388, 275, 241, 334, 412,
		393, 299, 343, 317, 265 };

	int fastestCurrentTime = times[0];

	for (int i = 0; i < names.length; i++) {
	    if (times[i] < fastestCurrentTime) {
		fastestCurrentTime = times[i];

	    }
	}

	System.out.println(fastestCurrentTime);
    }
}