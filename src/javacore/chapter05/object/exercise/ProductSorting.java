package javacore.chapter05.object.exercise;

public class ProductSorting {

    public String name;
    public String category;

    public double price;
    public char currency;

    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }

    public static void main(String[] args) {

        ProductSorting[] remainder = generateFakeProductList();
        ProductSorting[] remainder2 = generateFakeProductList();

        ProductSorting[] productArray = generateFakeProductList();

        for (int indexCurrencyConversion = 0; indexCurrencyConversion < productArray.length; indexCurrencyConversion++) {

            if (productArray[indexCurrencyConversion].currency == '€') {
                double newPriceED = productArray[indexCurrencyConversion].price * 0.95;

                productArray[indexCurrencyConversion].price = newPriceED;
                productArray[indexCurrencyConversion].currency = '$';
            }

            if (productArray[indexCurrencyConversion].currency == '¥');

            double newPriceYD = productArray[indexCurrencyConversion].price * 7.27;

            productArray[indexCurrencyConversion].price = newPriceYD;
            productArray[indexCurrencyConversion].currency = '$';
        }

        for (int indexVerif = 0; indexVerif < productArray.length; indexVerif++) {
            for (int indexProduct = 0; indexProduct < productArray.length - 1; indexProduct++) {

                if (productArray[indexProduct].price > productArray[indexProduct + 1].price) {

                    remainder[indexProduct] = productArray[indexProduct];
                    remainder2[indexProduct] = productArray[indexProduct + 1];

                    productArray[indexProduct] = remainder2[indexProduct];
                    productArray[indexProduct + 1] = remainder[indexProduct];
                }
            }
        }

        for (int indexDisplay = 0; indexDisplay < productArray.length; indexDisplay++) {

            productArray[indexDisplay].displayProduct();
        }
    }

    public void displayProduct() {
        System.out.println("Product Name : " + this.name + " | Category : " + this.category + " | Price : " + this.price + this.currency);
    }

    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }
}
