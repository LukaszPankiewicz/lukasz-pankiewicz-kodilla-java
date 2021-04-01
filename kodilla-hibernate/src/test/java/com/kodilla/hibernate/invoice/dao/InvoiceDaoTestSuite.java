package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product p = new Product("Egg");
        Product p1 = new Product("Milk");
        Product p2 = new Product("Bread");

        Item i = new Item(new BigDecimal(1), 10, (new BigDecimal(10)));
        Item i1 = new Item(new BigDecimal(2), 20, (new BigDecimal(20)));
        Item i2 = new Item(new BigDecimal(3), 30, (new BigDecimal(30)));

        i.setProduct(p);
        i1.setProduct(p1);
        i2.setProduct(p2);

        p.getItems().add(i);
        p1.getItems().add(i1);
        p2.getItems().add(i2);

        Invoice invoice = new Invoice("101");

        invoice.getItems().add(i);
        invoice.getItems().add(i1);
        invoice.getItems().add(i2);

        i.setInvoice(invoice);
        i1.setInvoice(invoice);
        i2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
