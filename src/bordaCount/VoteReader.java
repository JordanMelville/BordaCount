package bordaCount;

import java.util.ArrayList;

public class VoteReader {


ArrayList<Integer> votes = new ArrayList<Integer>();
int candidateCount = 3;
Candidate candidate1 = new Candidate("Mary Johnston");
Candidate candidate2 = new Candidate("Barry Hill");
Candidate candidate3 = new Candidate("Terry Thomas");

public void voteReader() {
	

// if the number of candidates is 3
if(candidateCount == 3) {
for(int i = 0; i < 30; i++) {
	votes.add(123);
	candidate1.addFirstPref();
	candidate2.addSecondPref();
	candidate3.addThirdPref();
}

for(int i = 0; i < 25; i++) {
	votes.add(132);
	candidate1.addFirstPref();
	candidate3.addSecondPref();
	candidate2.addThirdPref();
}

for(int j = 0; j < 20; j++) {
	votes.add(213);
	candidate2.addFirstPref();
	candidate1.addSecondPref();
	candidate3.addThirdPref();
	
}

for(int k = 0; k < 10; k++) {
	votes.add(231);
	candidate2.addFirstPref();
	candidate3.addSecondPref();
	candidate1.addThirdPref();
}

for(int l = 0; l < 5; l++) {
	votes.add(312);
	candidate3.addFirstPref();
	candidate1.addSecondPref();
	candidate2.addThirdPref();
}

for(int m = 0; m < 3; m++) {
	votes.add(321);
	candidate3.addFirstPref();
	candidate2.addSecondPref();
	candidate1.addThirdPref();
}
} else {
	
}
}
}
