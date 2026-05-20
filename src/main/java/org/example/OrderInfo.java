package org.example;
import java.time.LocalDate;

public class OrderInfo {

    private LocalDate dateOfOrder;
    private Integer orderNumber;

    public OrderInfo(int orderNumber ,int yearOfOrder, int monthOfOrder, int dayOfOrder) {
        this.orderNumber = orderNumber;
        this.dateOfOrder = LocalDate.of(yearOfOrder, monthOfOrder, dayOfOrder);
    }

    @Override
    public boolean equals(Object y) {
        if (y != null) {
            OrderInfo x = (OrderInfo) y;
            return dateOfOrder.equals(x.getDateOfOrder()) && orderNumber.equals(x.getOrderNumberLessThanThousand());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return dateOfOrder.getYear() * 1000000 + dateOfOrder.getMonthValue() * 10000 + dateOfOrder.getDayOfMonth() * 100 + orderNumber;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public Integer getOrderNumberLessThanThousand() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Order number " + orderNumber + " dated on " + dateOfOrder;
    }
}