package bordaCount;

public class Candidate {

private String candidateName;
private int firstPreference;
private int secondPreference;
private int thirdPreference;
	
public Candidate(String name) {
	candidateName = name;
}

public String getCandidateName() {
	return candidateName;
}
public void addFirstPref() {
	firstPreference++;
}

public void addSecondPref() {
	secondPreference++;
}

public void addThirdPref() {
	thirdPreference++;
}

public int getFirstPreference() {
	return firstPreference;
}

public int getSecondPreference() {
	return secondPreference;
	
}
public int getThirdPreference() {
	return thirdPreference;
}


}
