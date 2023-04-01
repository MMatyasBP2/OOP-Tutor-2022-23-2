import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	
	//Osztályváltozó lesz, szeretnénk felhasználni az osztályon belül több metódusban is.
	private static int arrayLength;
	
	public static void main(String[] args) {
		
		System.out.print("Give me the length of the array: ");
		
		//Az osztályváltozót inicializáljuk.
		arrayLength = readInteger();
		
		int array[] = fillArray(0, 100);
		
		//Az Arrays osztály alkalmazásával kiíratjuk a tömb elemeit.
		String arrayString = Arrays.toString(array);
		System.out.println(arrayString);
		
		//Az Arrays osztály sok hasznos metódusa közül felhívjuk a bináris keresést, és megkeressük a 10-es értéket a tömbben!
		int search = Arrays.binarySearch(array, 1);
		
		/*Megvizsgáljuk, hogy a search változó milyen értéket ad vissza. Ha -1, akkor nincs benne a tömbben a keresett kulcs,
		ha 1, akkor benne van.*/
		System.out.println("A keresett elem " + (search == -1 ? "nincs benne a tömbben!" : "benne van a tömbben!"));
		
		/*Az Arrays.asList() függvény át tudja konvertálni Listává a tömbünket.
		A lista sokkal dinamikusabb, gyorsabb, jobban skálázható, így ezt fogjuk használni minden esetben
		adatok feldolgozására!
		A 'var' kulcsszó egy ismeretlen változótípust jelöl. Így is megadhatjuk inicializáláskor a változótípust,
		mivel a fordító automatikusan felismeri azt.*/
		var list = Arrays.asList(array);
		
		/*Kicsit bonyolíthatjuk a kiíratást :)
		A lista tartalmaz egy forEach metódust, aminek a paramétere egy úgynevezett Action, azaz egysoros függvény.
		Az 's -> System.out.println(Arrays.toString(s)); egy ún. 'lambda' kifejezés, melynek bal oldalán egy segédváltozó van,
		jobb oldalán pedig maga az Action, amiben felhasználjuk a segédváltozót. A lambda kifejezéseket fogjuk még használgatni.*/
		list.forEach(s -> System.out.println(Arrays.toString(s)));
	}
	
	public static int readInteger()
	{
		int answer;
		
		while (!input.hasNextInt())
		{
			System.out.print("That's not a number! Please retry: ");
			input.next();
		}
		answer = input.nextInt();
		return answer;
	}
	
	public static int[] fillArray(int min, int max)
	{
		int[] array = new int[arrayLength];
		//A Random osztály segítségével előállíthatunk véletlenszámokat.
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(max - min);
		}
		
		return array;
	}
}
