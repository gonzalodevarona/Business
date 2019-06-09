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
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles){
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles);
		products = new ArrayList<Product>();
	}

	/**
	* Allows to calculate how many trees the manufacturing compnay has to plant because of its water consumption. <br>
	* @return The quantity of trees to be planted
	*/

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


	/**
	* Allows to add a product to a manufacturing business.  <br>
	* <b>post:</b> The product is added to a manufacturing business. 
	* @param product The product to be added 
	*/

	public void addProduct(Product product){
		products.add(product);
	}

	/**
	* Manufacturing business informatiom such as trees that must be planted and products info is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing manufacturing business <br>
	* @see water4tree()
	* @see Product.toString()
	* @return The information of a manufacturing business in a format to be shown to the final user
	*/

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