package dmit2015.oe.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dmit2015.oe.report.CategorySales;
import dmit2015.oe.service.OrderEntryService;

@Named
@ViewScoped
public class OnlineCatalogCategorySalesReportController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private OrderEntryService oeService;

	@PostConstruct
	public void init() {
		// TODO: Assign a default list of CategorySale
		
		// TODO: Set the reportTitle field value to "All Years Category Sales"
	}
	
	// TODO: Declare properties for a list of CategorySale, the selectedYear, and the reportTitle.
	// The reportTitle must be in the format "{selectedYear} Category Sales"
	
	// TODO: Add a method to return a list of all years with orders
	
	// TODO: Add a method to generate a report when the selectedYear field value changes
	
	
}
