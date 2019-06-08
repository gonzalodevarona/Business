/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 8 JUNE 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.ArrayList;



public class Manufacturing extends Business{

	//RELATIONSHIPS

	private ArrayList<Product> products;

	public Manufacturing(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys){
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles, surveys);
		products = new ArrayList<Product>();
	}

	public int water4tree(){
		int trees = 0;
		for (int i = 0; i< products.size() ;i++ ) {
			Product product = products.get(i);

			if (product.getInvima() != null) {

				if (product.getWaterRequired4Manufacturing() >= 1 && product.getWaterRequired4Manufacturing() <= 140) {
				 	trees = trees + 6;
				} else if (product.getWaterRequired4Manufacturing() >= 141 && product.getWaterRequired4Manufacturing() <= 800) {
				 	trees = trees + 25;
				} else if (product.getWaterRequired4Manufacturing() > 800) {
				 	trees = trees + 200;
				}
							
			}			
		}
		return trees;
	}

	public void addProduct(Product product){
		products.add(product);
	}

	@Override
	public String toString(){

		String reply = super.toString();
		       reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "| ************************************ MANUFACTURING BUSINESS INFORMATION *********************************** +\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "|\n";
			   reply += "| Trees that must be planted: "+water4tree()+"\n";
			   reply += "|\n";
			   

			   int k = 0;
			for (int i = 1;i<= products.size() && k< products.size() ;i++ ) {
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "| ********************************************** PRODUCT #"+i+" ********************************************* +\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += products.get(k).toString();
			   k++;
			   	
			}
			   

		return reply;
	
	}

} //end of class