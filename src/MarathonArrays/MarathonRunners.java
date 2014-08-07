package MarathonArrays;

public class MarathonRunners {
    public static void main(String[] arguments) {
	String[] names = { "Elana", "Thomas", "Hamilton", "Suzie", "Phil",
		"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
		"Daniel", "Neda", "Aaron", "Kate", "Dean" };

	int[] times = { 343, 273, 248, 329, 445, 402, 388, 300, 241, 334, 412,
		393, 299, 343, 317, 265, 355 };

	int fastestCurrentTime = times[0];
        String fastestCurrentName = names[0];

	for (int i = 0; i < names.length; i++) {
	    if (times[i] < fastestCurrentTime) {
		fastestCurrentTime = times[i];
                fastestCurrentName = names[i];

	    }
	}

	System.out.println("The fastest person was: "  + fastestCurrentName + 
                '\n' + "with a time of: " + fastestCurrentTime);
    }
}