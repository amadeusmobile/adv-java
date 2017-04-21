import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.demo.ejb3.LoanRemote;


public class Main {

	
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		props.put(Context.PROVIDER_URL, "t3://localhost:7001");
		//props.put(Context.SECURITY_PRINCIPAL, "ankur");
		//props.put(Context.SECURITY_CREDENTIALS, "ankur123");
		
		Context ctx = new InitialContext(props);
		LoanRemote lr =(LoanRemote)ctx.lookup("loan#com.demo.ejb3.LoanRemote");
		System.out.println(" The result : "+lr.applyLoan());
	}

}
