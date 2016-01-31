/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribueredesystemer;

import distribueredesystemer.data.Bruger;
import distribueredesystemer.data.Brugerdatabase;

/**
 *
 * @author j
 */
public class DistribueredeSystemer {

	public static void main(String[] args) throws Exception {

		Brugerdatabase db = Brugerdatabase.indlæsBrugerdatabase();
		//Diverse.sendMail("Test fra DIST", "Hej fra Jacob");

		for (Bruger b : db.brugere) {
			System.out.println(Diverse.udskriv(b, new StringBuilder()));
		}

		System.out.println("Der er: "+db.brugere.size()+" brugere");
		db.gemTilFil();
	}

}
