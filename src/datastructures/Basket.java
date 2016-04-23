/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lamya
 */
public class Basket {
    private List<Fruit> fruits=new ArrayList<Fruit>();
    private List<Vegetable> vegetables=new ArrayList<Vegetable>();
    
    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }
    
    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    
    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }
    
    public int getSize(){
        int size=fruits.size()+vegetables.size();
        return size;
    }
    
    public int getNumberFruitsByName(String name){
        int numberFruitsFound=0;
        for(Fruit fruit:fruits){
            if(fruit.getName().equals(name)){
                numberFruitsFound++;
            }
        }
        return numberFruitsFound;
    }
    
}
