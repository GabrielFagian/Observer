package com.tcc.designpatern.model;

import com.tcc.designpatern.interfaces.Observer;
import lombok.Getter;
import lombok.Setter;

import javax.swing.JOptionPane;

@Setter
@Getter
public class Manager implements Observer
{

    public Manager(){
    }

    public Manager(String name){
        this.name = name;
    }


    private String name;

    @Override
    public void update(Stock stock) {
        Integer quantity = stock.getQuantity();
        Integer almostEmpty = 15;
        if(quantity.compareTo(almostEmpty)<0){
            JOptionPane.showMessageDialog(null,"Gerente "+name+": notificação de apenas "
                    +stock.getQuantity()+" "+stock.getProduct()+ " no estoque");
        }
    }
}
