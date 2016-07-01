package de.hdm.grouptwo.server;

import java.util.Date;

import javax.servlet.ServletException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.grouptwo.shared.AdministrationService;
import de.hdm.grouptwo.shared.ReportService;
import de.hdm.grouptwo.shared.bo.LoginInfo;
import de.hdm.grouptwo.shared.bo.Profile;
import de.hdm.grouptwo.shared.report.Column;
import de.hdm.grouptwo.shared.report.CompositeParagraph;
import de.hdm.grouptwo.shared.report.MatchesBySearchprofileReport;
import de.hdm.grouptwo.shared.report.Row;
import de.hdm.grouptwo.shared.report.SimpleParagraph;
import de.hdm.grouptwo.shared.report.UnviewedMatchesReport;

public class ReportServiceImpl extends RemoteServiceServlet implements
		ReportService { 
	
	private static final long serialVersionUID = 1L;
	// private AdministrationService administrationService = null;
	
	/**
	 * No-Argument Constructor
	 * 
	 * @throws IllegalArgumentException
	 */
	public ReportServiceImpl() throws IllegalArgumentException {
		
	  }
	
	/**
	 * Initialization Method
	 */
	public void init() {
//		AdministrationServiceImpl admin = new AdministrationServiceImpl();
//		try {
//			admin.init();
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		this.administrationService = admin;
	}
	
	/**
	 * Method to get the AdministrationService Object
	 * 
	 * @return AdministrationService
	 */
//	public AdministrationService getAdministrationService() {
//		return this.administrationService;
//	}
	
	/**
	 * Method to get all matches by searchprofile, sorted by similarity degree
	 * 
	 * @param Profile
	 * @return MatchesBySearchprofileReport
	 */
	//public MatchesBySearchprofileReport getMatchesBySearchprofileReport(LoginInfo loginInfo) {
	public MatchesBySearchprofileReport getMatchesBySearchprofileReport() {
		MatchesBySearchprofileReport report = new MatchesBySearchprofileReport();
	
		// TODO Namen von Searchprofile hinzufügen
		report.setTitle("Matches for Searchprofile");
		report.setCreated(new Date());
		
		CompositeParagraph header = new CompositeParagraph();
		
		// TODO für Name etc wird Profil benötigt
		header.addSubParagraph(new SimpleParagraph("Report for User: "));	
		report.setHeaderData(header);
		
		// TEST
		Row row = new Row();
		row.addColumn(new Column("Col1"));
		row.addColumn(new Column("Col2"));
		report.addRow(row);
		
		return report;
	}
	
	public String testMethod() {
		return "RPC worked";
	}
	
	/**
	 * Method to get alle unviewed Matches
	 * 
	 * @param Profile
	 * @return
	 */
	public UnviewedMatchesReport getUnviewedMatches(Profile p) {
		UnviewedMatchesReport report = new UnviewedMatchesReport();
		// Do something
		return report;
	}
	
	
	

}
