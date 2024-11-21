package com.verfut.front.verfut.front.example;

import org.primefaces.event.ToggleEvent;
import org.primefaces.model.Visibility;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class DataTableDemoView implements Serializable {

    private List<Customer> customers1;

    private List<Customer> customers2;

    private List<Product> products1;

    private Customer selectedCustomer;

    private List<Customer> selectedCustomers;

    @Inject
    private CustomerService service;

    @Inject
    private ProductService productService;

    @Inject
    private OrderService orderService;

    @PostConstruct
    public void init() {
        customers1 = service.getCustomers(50);
        customers2 = service.getCustomers(50);
        products1 = productService.getProducts();
    }

    public long getTotalCount(String name) {
        return customers1.stream().filter(customers -> name.equals(customers.getRepresentative().getName())).count();
    }

    public void onRowToggle(ToggleEvent event) {
        if (event.getVisibility() == Visibility.VISIBLE) {
            Product product = (Product) event.getData();
            if (product.getOrders() == null) {
                product.setOrders(orderService.getOrders((int) (Math.random() * 10)));
            }
        }
    }

    public List<Customer> getCustomers1() {
        return customers1;
    }

    public List<Customer> getCustomers2() {
        return customers2;
    }

    public List<Product> getProducts1() {
        return products1;
    }

    public List<Customer> getSelectedCustomers() {
        return selectedCustomers;
    }

    public void setSelectedCustomers(List<Customer> selectedCustomers) {
        this.selectedCustomers = selectedCustomers;
    }

    public Customer getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(Customer selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

}
