package collection.Collections;

public class MovieDVDInfo {
	String movieName;
	String movieType;
	String hero;

	MovieDVDInfo(String t, String g, String a) {
		movieType = t;
		movieName = g;
		hero = a;
	}

	public String toString() {
		return movieName + " " + movieType + " " + hero + "\n";
	}
}
