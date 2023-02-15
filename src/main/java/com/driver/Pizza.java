package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int toppings;
    boolean isCheesed;
    boolean isTopped;
    boolean isBilled;
    boolean isTakeAway;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price = 300;
            this.toppings = 70;
        }
        else
        {
            this.price = 400;
            this.toppings = 120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        if(!isCheesed)
        {
            this.price += 80;
            isCheesed = true;
        }
        // your code goes here
    }

    public void addExtraToppings()
    {
        if(!isTopped)
        {
            this.price += toppings;
            isTopped = true;
        }
    }

    public void addTakeaway()
    {
        if(!isTakeAway)
        {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill()
    {
        if(!isBilled)
        {
            if (isCheesed) this.bill += "Extra Cheese Added: 80\n";
            if (isTopped) this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if (isTakeAway) this.bill += "Paperbag Added: 20\n";
            this.bill += "Total Price: " + this.price+"\n";
            isBilled = true;
            return this.bill;
        }
        return this.bill;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Boolean getVeg()
    {
        return isVeg;
    }

    public void setVeg(Boolean veg)
    {
        isVeg = veg;
    }

    public void setBill(String bill)
    {
        this.bill = bill;
    }

    public int getToppings()
    {
        return toppings;
    }

    public void setToppings(int toppings)
    {
        this.toppings = toppings;
    }

    public boolean isCheesed()
    {
        return isCheesed;
    }

    public void setCheesed(boolean cheesed)
    {
        isCheesed = cheesed;
    }

    public boolean isTopped()
    {
        return isTopped;
    }

    public void setTopped(boolean topped)
    {
        isTopped = topped;
    }

    public boolean isBilled()
    {
        return isBilled;
    }

    public void setBilled(boolean billed)
    {
        isBilled = billed;
    }

    public boolean isTakeAway()
    {
        return isTakeAway;
    }

    public void setTakeAway(boolean takeAway)
    {
        isTakeAway = takeAway;
    }
}
