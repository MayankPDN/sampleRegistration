package TestUtil;



	

import java.util.ArrayList;

import com.excel.util.Xls_Reader;



	

	public class UtilityToGetDataFromExcel { 
	static com.excel.util.Xls_Reader reader;

		public static ArrayList<Object[]> getdataFromExcel() {
			
			ArrayList<Object[]> myData1 = new ArrayList<Object[]>();
			try {
			reader= new Xls_Reader("C:\\Users\\Mayank Gohil\\eclipse-workspace\\simpleregistration\\src\\DatafromExcel\\testdataforbaseballform.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			for (int rowNum =2; rowNum <=reader.getRowCount("baseball"); rowNum++) {
				String FirstName  = reader.getCellData("baseball", "FirstName", rowNum);
				String LastName = reader.getCellData("baseball", "LastName", rowNum);
				String StreetAddress  = reader.getCellData("baseball", "StreetAddress", rowNum);
				String City = reader.getCellData("baseball", "City", rowNum);
				String State = reader.getCellData("baseball", "State", rowNum);
				String Postal = reader.getCellData("baseball", "Postal", rowNum);
				String DOB = reader.getCellData("baseball", "DOB", rowNum);
				String ParentsFirstName = reader.getCellData("baseball", "ParentsFirstName", rowNum);
				
				Object ob[] = {FirstName , LastName, StreetAddress, City, State, Postal, DOB, ParentsFirstName};
				myData1.add(ob);
			}
			return myData1;
		}
		
	}


