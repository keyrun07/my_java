package algoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import jdk.nashorn.internal.runtime.URIUtils;

public class TournamentWinner {

	public TournamentWinner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
	    ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
	    ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
	    ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
	    competitions.add(competition1);
	    competitions.add(competition2);
	    competitions.add(competition3);
	    ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
	    String expected = "Python";
	    String actual = new Program().tournamentWinner(competitions, results);
	    //URIUtils.assertTrue(expected == actual);
	}

}


class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
      Hashtable<String, Integer> hm=new Hashtable<String, Integer>();
      String winner;
        for (int counter = 0; counter < competitions.size(); counter++) {
          
          ArrayList<String> comptitors = competitions.get(counter);
          winner =(results.get(counter) ==1)?comptitors.get(0):comptitors.get(1);
          if(hm.containsKey(winner)) {
        	  hm.replace(winner, hm.get(winner)+1);
          }else {
        	  hm.put(winner, 1);
          }
          
          
     }
        System.out.println(hm);
    // Write your code here.
    return "";
  }
}