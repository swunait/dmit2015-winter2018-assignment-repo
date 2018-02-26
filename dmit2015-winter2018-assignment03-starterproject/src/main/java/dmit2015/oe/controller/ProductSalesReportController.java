package dmit2015.oe.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dmit2015.oe.report.ProductSales;
import dmit2015.oe.service.OrderEntryService;

@Named
@ViewScoped
public class ProductSalesReportController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private OrderEntryService oeService;
	
	@PostConstruct
	public void init() {
		// TODO: Assign a default list of ProductSale
		
		// TODO: Set the reportTitle field value to "Top " + maxResult + " selling products of all time";
	}
	
	// TODO: Declare properties for a list of ProductSale, the selectedYear, the maxResult, and the reportTitle.
	// The reportTitle must be in the format "{selectedYear} Product Sales"
	
	// TODO: Add a method to return a list of all years with orders
			
	// TODO: Add a method to generate a report when the selectedYear or maxResult field value changes.
	
	
	
}
