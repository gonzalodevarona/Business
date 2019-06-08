/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 2 JUNE 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.*;

public class Education extends Service implements Taxable{

	public final static String HIGHSCHOOL = "High school";
	public final static String COLLEGE  = "College";


	//ATTRIBUTES
	private String approvalNumberMEN;
	private double yearsAsHighQuality;
	private int nationalRanking11;
	private int nationalRankingPro;
	private String principalsName;
	private String sector;
	private int totalStudents1And2;
	private int totalStudents;


	//METHODS
	public Education(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys, String approvalNumberMEN, 
	double yearsAsHighQuality, int nationalRanking11, int nationalRankingPro, String principalsName, String sector, int totalStudents1And2, int totalStudents){
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles, surveys);
		this.approvalNumberMEN = approvalNumberMEN;
		this.yearsAsHighQuality = yearsAsHighQuality;
		this.nationalRanking11 = nationalRanking11;
		this.nationalRankingPro = nationalRankingPro;
		this.principalsName = principalsName;
		this.sector = sector;
		this.sector = sector;
	}


	public String getApprovalNumberMEN(){
		return approvalNumberMEN;
	}

	public void setApprovalNumberMEN(String approvalNumberMEN){
		this.approvalNumberMEN = approvalNumberMEN;
	}


	public double getYearsAsHighQuality(){
		return yearsAsHighQuality;
	}
	public void setYearsAsHighQuality(double yearsAsHighQuality){
		this.yearsAsHighQuality = yearsAsHighQuality;
	}


	public int getNationalRanking11(){
		return nationalRanking11;
	}
	
	public void setNationalRanking11(int nationalRanking11){
		this.nationalRanking11 = nationalRanking11;
	}


	public int getNationalRankingPro(){
		return nationalRankingPro;
	}
	
	public void setNationalRankingPro(int nationalRankingPro){
		this.nationalRankingPro = nationalRankingPro;
	}


	public String getPrincipalsName(){
		return principalsName;
	}

	public void setPrincipalsName(String principalsName){
		this.principalsName = principalsName;
	}


	public String getSector(){
		return sector;
	}

	public void setSector(String sector){
		this.sector = sector;
	}


	public int getTotalStudents1And2(){
		return totalStudents1And2;
	}

	public void setTotalStudents1And2(int totalStudents1And2){
		this.totalStudents1And2 = totalStudents1And2;
	}


	public int getTotalStudents(){
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents){
		this.totalStudents = totalStudents;
	}

	public double procultura(){
		double tax = (totalStudents1And2 * 100);
		tax = tax / totalStudents;

		tax = 20 - tax;

		if (tax < 0) {
			tax = 0;
		}

		return tax;
	}


} //end of class