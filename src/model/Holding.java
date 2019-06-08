/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 20 MAY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.ArrayList;

public class Holding{

	//ATTRIBUTES
	private String name;
	private String owner;

	//RELATIONSHIPS
	private ArrayList<Business> businesses;
	private Cubicle[][] building;

	public Holding(String name, String owner, Cubicle[][] building){
		this.name = name;
		this.owner = owner;
		this.building = building;
		businesses = new ArrayList<Business>();
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getOwner(){
		return owner;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}

	public String addBusiness(Business business){
		businesses.add(business);

		return "New business has been added to "+name+" holding";
	}


	public Business findBusiness(int nit){
		Business found = null;
		boolean stop = false;

		for (int i = 0;i<businesses.size() && !stop ;i++ ) {
			if (businesses.get(i).getNit() == nit) {
				stop = true;

				found = businesses.get(i);
				
			}
		}

		return found;
	}


	public int businessCounter(){
		int numberOfBusinesses = businesses.size();
		return numberOfBusinesses;
	}


	public String showAllBusinesses(){
		String reply = "";

		for (int i = 0;i<businesses.size() ;i++ ) {

			Business businessInMatter = businesses.get(i);

			if (businessInMatter instanceof Education) {
				Education businessInMatterE = (Education) businessInMatter;
				reply += businessInMatterE.toString();

			} else if (businessInMatter instanceof Public) {
				Public businessInMatterP = (Public) businessInMatter;
				reply += businessInMatterP.toString();

			} else if (businessInMatter instanceof Technological) {
				Technological businessInMatterT = (Technological) businessInMatter;
				reply += businessInMatterT.toString();

			} else{
				Manufacturing businessInMatterM = (Manufacturing) businessInMatter;
				reply += businessInMatterM.toString();

			}

			
		}

		return reply;
	}


} //end of class