
public class Client {

	// to get stub execute in src directory: wsimport -d ./ -keep -p gen http://localhost:1234/ComputationService?wsdl
	
	public static void main(String args[]) {
		// get reference to remote service
		gen.ComputationService service = new gen.ComputationServiceService().getComputationServicePort();
			
		String result1 = service.getPrice("GZUZ", "Wolke 7");	//Funktion getPrice wird ausgeführt und Ergebnis wird in Variable gespeichert
		String result2 = service.getPrice("Raf Camora" , "Palmen aus Plastik");
		
		String result3 = service.getAlbum("GZUZ");	//Funktion getAlbum wird ausgeführt und Ergebnis wird in Variable gespeichert
		String result4 = service.getAlbum("Raf Camora");
		
		String result5 = service.buyAlbum("GZUZ", "Wolke 7");	//Funktion buyAlbum wird ausgeführt und Ergebnis wird in Variable gespeichert
		String result6 = service.buyAlbum("Raf Camora", "Palmen aus Plastik");
		
		
		//Alle Ergebnisse werden ausgegeben
		
		System.out.println("Result 1: " + result1 + "€");
		System.out.println("Result 2: " + result2 + "€");
		
		System.out.println("Result 3: " + result3);
		System.out.println("Result 4: " + result4);
		
		System.out.println("Result 5: " + result5);
		System.out.println("Result 6: " + result6);		
		
	}
}
