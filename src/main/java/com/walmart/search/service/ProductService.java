package com.walmart.search.service;
import com.walmart.search.dao.ProductDAOImpl;
import com.walmart.search.exception.SearchNotFoundException;
import com.walmart.search.exception.SearchParamNotFoundException;
import com.walmart.search.model.Product;
import com.walmart.search.util.Constant;
import com.walmart.search.util.DataType;
import com.walmart.search.util.ExceptionMessagesEnum;
import com.walmart.search.util.Palindrome;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductDAOImpl productDAO;

    public List<Product> findProducts(String value){

        if (DataType.isInteger(value)) {
            List<Product> product = productDAO.findById(Integer.parseInt(value));
            if (product.isEmpty()) {
                throw new SearchNotFoundException("Search not found. Check with other ID");
            } else {
                if(Palindrome.isPalindrome(value)){
                    return calcNewPrice(product);
                } else{
                    return product;
                }

            }
        } else {
            if (value.length() < 4) {
                throw new SearchParamNotFoundException(ExceptionMessagesEnum.PARAM_NOT_FOUND.getValue());
            } else {
                List<Product> product = productDAO.findByBrandOrDescription(value);

                if(Palindrome.isPalindrome(value)){
                    return calcNewPrice(product);
                } else{
                    return product;
                }
            }
        }
    }

    private List<Product> calcNewPrice(List<Product> products){
        for (Product p : products) {
            try {
                p.setPriceWithDiscount((int)((Constant.DISCOUNT/100) * p.getPrice()));
                p.setDiscount(Constant.DISCOUNT);
            } catch (Exception e){
                p.setPriceWithDiscount(0);
                p.setDiscount(0);
            }

        }

        return products;
    }
}
