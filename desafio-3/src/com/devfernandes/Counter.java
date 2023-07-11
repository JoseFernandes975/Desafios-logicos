package com.devfernandes;

import java.util.HashMap;

public class Counter {

	 // Função para retornar a contagem e pegar os pares
   
    static int countPairs(int list[], int n) {
     
        // Armazenar
       
  HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++)
            map.put(list[i] - i, 0);
         
        for (int i = 0; i < n; i++)
            map.put(list[i] - i, map.get(list[i] - i) + 1);
     
        //Contagem
        int count = 0;
        
        for (int x : map.values()) {
            int cnt = x;
            
            // Se cnt é o número de elementos
      //qual a diferença com seu índice é igual, então pares serão possiveis ((cnt * (cnt - 1)) / 2)
            
            count += ((cnt * (cnt - 1)) / 2);
        }
        return count;
    }	
}