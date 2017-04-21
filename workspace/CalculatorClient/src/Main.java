import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.demo.ejb.Calculator;

public class Main {

	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		props.put(Context.PROVIDER_URL, "t3://localhost:7001");
		props.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");

		Context ctx = new InitialContext(props);

		Calculator cal = (Calculator) ctx.lookup("cal#com.demo.ejb.Calculator");

		System.out.println(cal.add(2, 5));

	}

}
