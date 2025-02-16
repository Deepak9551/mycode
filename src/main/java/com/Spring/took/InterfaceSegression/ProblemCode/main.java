package com.Spring.took.InterfaceSegression.ProblemCode;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
       for (User user : list){
           if ((user instanceof Buyer)){
               System.out.println("do task");
           }

       }
    }
}
