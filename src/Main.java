import entities.Product;
import utils.listNewFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd case", 80.90));

        //forma 1
        //List<String> names = list.stream().map(new listNewFunction()).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //forma 2
        //List<String> names = list.stream().map(Product::newProdutct).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //forma 3
        //List<String> names = list.stream().map(Product::newProduct2).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //forma 4
        //Function<Product, String> upString = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(upString).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //forma 5
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}