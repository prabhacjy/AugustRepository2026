package tekarchJavaHackathon;

import java.util.Arrays;

public class question33 {
	class Person {
	    int height;
	    int weight;
	    Person(int h, int w) {
	        height = h;
	        weight = w;
	    }
	} 
	public class CircusTower {
	    public static int maxPeople(Person[] people) {
	        // Step 1: Sort by height, then by weight
	        Arrays.sort(people, (a, b) -> {
	            if (a.height == b.height) return a.weight - b.weight;
	            return a.height - b.height;
	        });

	        // Step 2: Extract weights and find LIS
	        int[] dp = new int[people.length];
	        int maxLen = 0;

	        for (Person p : people) {
	            int idx = Arrays.binarySearch(dp, 0, maxLen, p.weight);
	            if (idx < 0) idx = -(idx + 1);
	            dp[idx] = p.weight;
	            if (idx == maxLen) maxLen++;
	        }

	        return maxLen;
	    }


		

		    public static void main(String[] args) {
		        Person[] people = { new Person (65, 100),
		        		new Person(70, 150),
		        		new Person(56, 90),
		        		new Person(75, 190),
		        		new Person(60, 95),
		        		new Person(68, 110)};

		        System.out.println("Max people in tower: " + maxPeople(people));
		    }
		}

	}


