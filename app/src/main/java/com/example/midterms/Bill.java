package com.example.midterms;

public class Bill {
    int previous;
    int current;
    Pipe type;
    int pack;
    int month;

    public Bill(int previous, int current, Pipe type, int pack, int month) {
        this.previous = previous;
        this.current = current;
        this.type = type;
        this.pack = pack;
        this.month = month;
    }

    // TODO Milestone 3: Calculate bill.
    public double get_bill() {
        double result = 0;
        int consumption = previous - current;
        switch(pack){
            case 1: // Basic
                result = consumption * type.getDiameter();
                break;
            case 2: // Regular
                if(consumption < 20){
                    result = consumption * 15.75;
                } else if(consumption < 50){
                    result = 500 + 12 * (consumption - 20);
                } else{
                    result = 800 + 10 * (consumption - 50);
                }
                break;
            case 3: // Premium
                if(consumption < 100){
                    result = 850;
                } else if(consumption < 250){
                    result = 1500;
                } else {
                    result = 2750;
                }
                break;
        }
        month++;
        return result;
    }
}
