
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


//Damit exportiert werden kann muss @WebService angegeben werden
@WebService(name = "ComputationService", targetNamespace = "http://localhost:1234/ComputationService")
//Gibt ann dass Soap als Kommunikation genutzt wird und dass der style rpc ist, also remote procedure call
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ComputationService {

		@WebMethod(operationName="factorial") //standardmäßig Name der Methode -> () könnte man auch weglassen
		@WebResult(name = "result")
		public int factorial(@WebParam(name="n") int n) throws InterruptedException {
			Thread.sleep(1000);
	        if (n == 0) 
	        	return 1;
	        return n * factorial(n-1);
	    }

}
