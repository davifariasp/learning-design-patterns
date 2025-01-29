package com.davifariasp.behavioral.state.problema;

public class Order {

    private String status;

    public void setStatus(String status){
        this.status = status;
    }

    public void processOrder(){
        if(this.status.equals("New")){
            System.out.println("Order is being processed");
            this.status = "Processed";
        } else if (this.status.equals("Processed")){
            System.out.println("Order is being shipped");
            this.status = "Shipped";
        } else if (this.status.equals("Shipped")){
            System.out.println("Order is being delivered");
            this.status = "Delivered";
        } else if (this.status.equals("Delivered")){
            System.out.println("Order is being closed");
            this.status = "Closed";
        } else {
            System.out.println("Order is closed");
        }
    }
}
