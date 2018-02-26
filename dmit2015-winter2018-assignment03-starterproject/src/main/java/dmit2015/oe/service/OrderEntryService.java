package dmit2015.oe.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import dmit2015.oe.entity.Category;
import dmit2015.oe.entity.Customer;
import dmit2015.oe.entity.Inventory;
import dmit2015.oe.entity.Order;
import dmit2015.oe.entity.ProductDescription;
import dmit2015.oe.entity.ProductInformation;
import dmit2015.oe.entity.Warehouse;
import dmit2015.oe.report.CategorySales;
import dmit2015.oe.report.ProductSales;

@Stateless
public class OrderEntryService {

	@Inject
	private EntityManager entityManager;
	
	public Category findOneCategory(long categoryId) {
		return entityManager.find(Category.class, categoryId);
	}
	
	public List<Category> findAllCategory() {
		return entityManager.createQuery(
			"SELECT c FROM Category c ORDER BY c.categoryName"
			, Category.class)
			.getResultList();
	}
	
	public ProductInformation findOneProductInformation(long categoryId) {
		return entityManager.find(ProductInformation.class, categoryId);
	}
	
	public List<ProductInformation> findAllProductInformation() {
		return entityManager.createQuery(
			"SELECT pi FROM ProductInformation pi ORDER BY pi.productName"
			, ProductInformation.class)
			.getResultList();
	}
	
	public List<ProductDescription> findAllProductDescription() {
		return entityManager.createQuery(
			"SELECT pd FROM ProductDescription pd"
			, ProductDescription.class)
			.getResultList();
	}
	
	public Customer findOneCustomer(long customerId) {
		return entityManager.find(Customer.class, customerId);
	}
	
	public List<Customer> findAllCustomer() {
		return entityManager.createQuery(
			"SELECT c FROM Customer c"
			, Customer.class)
			.getResultList();
	}
	
	public Order findOneOrder(long orderId) {
		return entityManager.find(Order.class, orderId);
	}
	
	public List<Order> findAllOrder() {
		return entityManager.createQuery(
			"SELECT o FROM Order o ORDER BY o.orderDate DESC"
			, Order.class)
			.getResultList();
	}
	
	public List<Warehouse> findAllWarehouse() {
		return entityManager.createQuery(
			"SELECT w FROM Warehouse w "
			, Warehouse.class)
			.getResultList();
	}
	
	public List<Inventory> findAllInventory() {
		return entityManager.createQuery(
			"SELECT i FROM Inventory i "
			, Inventory.class)
			.getResultList();
	}

	public List<Integer> findYearsWithOrders() {
		return entityManager.createQuery(
			"SELECT YEAR(o.orderDate) FROM Order o GROUP BY YEAR(o.orderDate) ORDER BY YEAR(o.orderDate)"
			, Integer.class)
			.getResultList();
	}
	
	public List<Category> findOnlineCatalogCategories() {
		return entityManager.createQuery(
			"SELECT c FROM Category c WHERE c.parentCategory.categoryId = 90 ORDER BY c.categoryName"
			, Category.class)
			.getResultList();
	}
	
	public List<CategorySales> findCategorSalesForOnlineCatalog() {
		// TODO: Add the missing code below to return a list of CategorySales POJO 
		// where the Category entity field "parentCategory.categoryId" does not equal to 90.
		return null;
	}
	
	public List<CategorySales> findCategorSalesForOnlineCatalogYear(Integer year) {
		// TODO: Add the missing code below to return a list of CategorySales POJO 
		// where the Category entity field "parentCategory.categoryId" does not equal to 90 and 
		// the Order entity field "orderDate" year equals to the method parameter for the year.
		// You can use the JPA aggregate function YEAR to extract the year from a date field.
		return null;
	}
	
	public List<CategorySales> findCategorSalesForParentCategoryId(Long parentCategoryId) {
		// TODO: Add the code the perform the following: 
		// If the parentCategoryI" value is 90 then return a list of CategorySales POJO
		// where the Category entity field "parentCategory.categoryId" is 10, 20, or 30.
		// Otherwise return a list of CategorySales POJO 
		// where the Category entity field "parentCategory.categoryId" equals to the method parameter "parentCategoryId". 
		return null;
	}
	
	public List<CategorySales> findCategorSalesForParentCategoryIdAndYear(Long parentCategoryId, Integer year) {
		// TODO: Add the code the perform the following: 
		// If the parentCategoryId" value is 90 then return a list of CategorySales POJO
		// where the Category entity field "parentCategory.categoryId" is 10, 20, or 30 
		// AND the Order entity field "orderDate" year equals to the method parameter for the year.
		// Otherwise return a list of CategorySales POJO 
		// where the Category entity field "parentCategory.categoryId" equals to the method parameter "parentCategoryId".
		return null;
	}
	
	public List<ProductSales> findProductSales(int maxResult) {
		// TODO: Add the missing code below to return list of ProductSales POJO 
		// and limit the max results returned to equal the "maxResult" method parameter.
		return null;
	}
	
	public List<ProductSales> findProductSalesForYear(Integer year, int maxResult) {
		// TODO: Add the missing code below to return list of ProductSales POJO 
		// where the Order entity field "orderDate" year value equals the method parameter for the year
		// and limit the max results returned to equal the "maxResult" method parameter value.
		return null;
	}
	
}
