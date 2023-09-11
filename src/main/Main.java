package main;

public class Main {
	public static void main(String[] args) {




		Persoana persoana = new Persoana("Popescu ", "Ion-Andrei ", "Cluj ", 40, false, "JAVA");

		Persoana persoana2 = new Persoana();

		System.out.println();

		Persoana.curs = "Java";


		System.out.println("Nume " + persoana.getNume());
		System.out.println("Prenume " + persoana.getPrenume());
		System.out.println("Oras " + persoana.getOras());
		System.out.println("Varsta " + persoana.getVarsta());
		System.out.println("Casatorita" + persoana.getisCasatorita());

		persoana2.setNume("Andronache ");
		persoana2.setPrenume("Ana ");
		persoana2.setOras("Brasov ");
		persoana2.setVarsta(35);

		System.out.println(persoana2);




		//Pentru corectarea automata a temei se folosesc cele doua teste JUnit din pachetul test
		//Tema este completa atunci cand ambele teste ruleaza fara erori
		//TODO-urile 1-5 se gasesc in clasa TestBasics - DONE
		//TODO-urile 6-26 vor fi validate in clasa TestPersoane

		//Creaza o noua clasa (New>Class) cu numele "Persoana"
		//TODO 6-9 vor fi realizate in aceasta noua clasa - DONE

		//TODO 6: Adauga variabilele declarate mai sus ca proprietati ale clasei: -DONE
		//nume, prenume, oras, varsta, casatorita

		//TODO 7: Faceti aceste proprietati private/Setati pentru toate aceste variabile modificatorul de acces "private"- DONE

		//TODO 8: Generati un constructor cu toti parametrii -> fie scrieti de la zero constructorul
		//fie folositi eclipse pentru a-l genera: Click Dreapta in editor> Source > Generate Constructor using Fields...-DONE

		//TODO 9: Generati getters/setters pentru toate variabilele (La fel ca TODO 8) DONE

		//TODO 10: Inapoi in clasa Main creati o instanta pentru un obiect de tip Persoana folosind date la alegere pentru constructor - DONE

		//TODO 11: Printati instanta folosind System.out.println(); DONE

		//TODO 12: Ati observat ca mesajul afisat nu ofera informatii despre valorile instantei si nu este "inteligibil"
		//In clasa Persoana, generati o metoda publica toString ce returneaza un String format din proprietatile clasei concatenate
		//astfel incat sa ofere un mesaj coerent (asemanator cu modelul de la TODO 9 pentru generarea automata a metodei toString) - DONE

		//TODO 13: In clasa Main, declarati o noua variabila de tip Persoana folosind un constructor fara niciun parametru - done

		//TODO 14: HINT! Un constructor default fara parametrii este disponibil doar daca in clasa nu este definit un alt constructor
		//Adaugati un constructor cu niciun parametru in clasa Persoana pentru a rezolva eroarea din clasa Main - DONE

		//TODO 15: In Main Printati instanta fara valori initializate folosind System.out.println(); - DONE

		//TODO 16: Setati valorile proprietatilor acestei instante una cate una (folosind setterii) si afisati din nou instanta

		//TODO 17: In Persoana, adaugati o proprietate publica statica de tip String "curs" (fara a acorda o valoare acesteia) DONE

		//TODO 18: Concatenati si valoarea acesteia cu mesajul din metoda toString()

		//TODO 19: Rulati clasa main pentru a vedea diferentele in mesajele afisate

		//TODO 20: In clasa Main acordati proprietatii curs valoarea "JAVA" fara a folosi niciuna dintre instante (inainte de afisarea celorlalte variabile - ex langa TODO 10)
		//linia 25 - DONE?

		//TODO 21: Rulati din nou clasa main si observati diferentele

		//TODO 22: In clasa Persoana, adaugati o metoda "creste" ce este apelata atunci cand varsta persoanei se schimba (metoda ce aduna 1 la varsta curenta) - DONE ROW 58

		//TODO 23: In clasa Main apelati metoda nou creata pentru una dintre instante si afisati instanta pentru a vedea rezultatele

		//TODO 24: In clasa Persoana, adaugati o metoda numita obtineIdentificator() ce returneaza un String

		//TODO 25: In metoda adaugata procesati numele si prenumele din una dintre instantele obiectului Persoane astfel incat sa returnati un ID formatat astfel:
		//andralaura_ANTONACHE - DONE
		//pentru prenume: "Andra LAura", nume: "Antonache" sau pentru prenume = "Andra-LAURA   ", nume = "antonache"
		//Folosind metodele puse la dispozitie de obiectele de tip String - descrise aici: https://www.w3schools.com/java/java_ref_string.asp

		//TODO 26: In Main, apelati metoda si afisati stringul returnat de aceasta

		//TODO 27: Rulati si testele din JUnitul TestPersoana

	}

}
