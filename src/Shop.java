public class Shop {
    public static void main(String[] args) {
        Category category1 = new Category("Sweets", "Sweets for everyone's");
        Product product1 = new Product("Milka", 2.1, "I like it!");
        Product product2 = new Product("Nutella", 3.2, "It is the best!");

        System.out.println("Product1 belongs to category: " + category1.name + " is called: " + product1.name + " and has price: " + product1.price + " and slogan: " + product1.description);
        System.out.println("Product2 belongs to category: " + category1.name + " is called: " + product2.name + " and has price: " + product2.price + " and slogan: " + product2.description);

        Category category2 = new Category("Fruits", "Fruits for everyone's");
        Product product3 = new Product("Orange ", 2.3, "Fresh orange juice.");

        System.out.println("Product3 belongs to category: " + category2.name + " is called: " + product3.name + "and has price: " + product3.price + " and description: " + product3.description);

        Product product4 = new Product("ice cream", 3.3, "I love ice creams");
        System.out.println("Product4: is called: " + product4.name + " and has price: " + product4.price + " and description: " + product4.description);

        Product productInPromotion = new Product("Milka", 2.1, "Promotion");
        SpecialOffer specialOffer = new SpecialOffer("It is the best!", "12-12-2019", "20%", productInPromotion);
        System.out.println("Product in promotion is called: " + productInPromotion.name + " and it has regular price: " + productInPromotion.price + " now it has label: "
                + productInPromotion.description + " the due date of the promotion will be expired: " + specialOffer.dueDate + " current discount: " + specialOffer.discount + " promotion with slogan sounds: " + specialOffer.offerDescription);
    }
}