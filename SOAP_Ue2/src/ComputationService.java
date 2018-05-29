import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


// Damit exportiert werden kann muss @WebService angegeben werden
@WebService(name = "ComputationService", targetNamespace = "http://localhost:1234/ComputationService")
// Gibt ann dass Soap als Kommunikation genutzt wird und dass der style rpc ist, also remote procedure call
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ComputationService {

		@WebMethod(operationName="getPrice") // Funktion getPrice erstellen
		@WebResult(name = "preisBandName")
		public String getPrice(@WebParam(name="bandName") String bandName, @WebParam(name="albumName") String albumName)
		{
			// Es wird BandName und AlbumName übergeben und der Preis für das Album zurückgegeben
			float preis = 0;
			
			if(bandName.equals("GZUZ"))
			{
				if(albumName.equals("Wolke 7")){
					preis = 20;
				}
				else if(albumName.equals("Sampler 4")){
					preis = 12;
				}
			}
			else if(bandName.equals("Raf Camora"))
			{
				if(albumName.equals("Hoch 2")){
					preis = 10;
				}
				else if(albumName.equals("Palmen aus Plastik")){
					preis = 12;
				}
			}
			 String preisback= Float.toString(preis);
			return preisback;
	    }
		@WebMethod(operationName="getAlbum") //Funktion getAlbum wird erstellt
		@WebResult(name = "album")
		public String getAlbum(@WebParam(name="artist") String artist)
		{
		
			// Es wird der Künstler übergeben und es werden dessen Alben zurückgegeben
			
			String album = null;
			
			if(artist.equals("GZUZ"))
			{
				album = "Wolke 7, Sampler 4";
			}
			else if(artist.equals("Raf Camora"))
			{
				album = "Hoch 2, Palmen aus Plastik";
			}
			return album;
	    }
		@WebMethod(operationName="buyAlbum") // Funktion buyAlbum wird erstellt
		@WebResult(name = "bill")
		public String buyAlbum(@WebParam(name="artist") String artist, @WebParam(name="album") String album)
		{
			//Es wird Künstler Name übergeben und Name des Albums und es wird sozusagen eine Zahlungsbestätigung oder Rechnung zurückgegeben
			
			String bill = null;
			
			if(artist.equals("GZUZ") && album.equals("Wolke 7"))
			{
				bill = "Sie haben erfolreich GZUZ Wolke 7 für 20,00€ gekauft!";
			}
			else if(artist.equals("GZUZ") && album.equals("Sampler 4"))
			{
				bill = "Sie haben erfolreich GZUZ Sampler 4 für 12,00€ gekauft";
			}
			else if(artist.equals("Raf Camora") && album.equals("Palmen aus Plastik"))
			{
				bill = "Sie haben erfolreich Raf Camora Palmen aus Plastik für 12,00€ gekauft";
			}
			else if(artist.equals("Raf Camora") && album.equals("Hoch 2"))
			{
				bill = "Sie haben erfolreich Raf Camora Hoch 2 für 10,00€ gekauft";
			}
			else {
				bill = "Falsche Eingabe";
			}
		
			
			return bill;
	    }
}
