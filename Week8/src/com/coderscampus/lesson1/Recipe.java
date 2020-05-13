package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;

public class Recipe {

    private String name;
    private String instructions;
    private Optional<BigDecimal> priceOpt = Optional.empty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Optional<BigDecimal> getPriceOpt() {
        return priceOpt;
    }

    public void setPriceOpt(BigDecimal price) {
        this.priceOpt = Optional.of(price);
    }

    @Override
    public String toString() {
        return "Recipe" +
                "\nName: " + name +
                "\nInstructions: " + instructions +
                "\nPriceOpt:" + priceOpt
                ;
    }
}
