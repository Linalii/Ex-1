package lesson.steamApi.data;

import java.time.LocalDate;
import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private double price;
    private LocalDate localDate;

    public Item(int id, String name, double price, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Double.compare(price, item.price) == 0 && Objects.equals(name, item.name) && Objects.equals(localDate, item.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, localDate);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", localDate=" + localDate +
                '}';
    }
}
