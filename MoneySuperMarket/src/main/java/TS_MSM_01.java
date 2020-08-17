import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS_MSM_01 {
	
	@Test
	public void newTest01() throws IOException
	{
		MoneySuperMarketInputs inputs = new MoneySuperMarketInputs();
		inputs.loadExcel();
	}

}
