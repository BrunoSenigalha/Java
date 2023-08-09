package entities;


import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client = new Client();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        double sum = 0;

        for (OrderItem item: items) {
            sum += item.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + fmt.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client.getName() + " " + "(" + client.getBirthDate() + ")" + " - " + client.getEmail()+ "\n");
        sb.append("Order items:\n" );
        for (OrderItem item: items) {
            sb.append(item.getProduct().getName() + ", $");
            sb.append(item.getPrice() + ", ");
            sb.append("Quantity: " + item.getQuantity());
            sb.append("Subtotal: $" + item.subTotal() + "\n");
        }
        sb.append("Total price: $" + total());

        return sb.toString();
    }
}
