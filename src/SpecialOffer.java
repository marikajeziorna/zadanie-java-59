public class SpecialOffer {
    String offerDescription;
    String dueDate;
    String discount;
    Product product;

    SpecialOffer(String offerDescription, String dueDate, String discount, Product product) {
        this.offerDescription = offerDescription;
        this.dueDate = dueDate;
        this.discount = discount;
        this.product = product;
    }
}


