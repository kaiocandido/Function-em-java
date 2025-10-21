package utils;

import entities.Product;

import java.util.List;
import java.util.function.Function;

public class listNewFunction implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
