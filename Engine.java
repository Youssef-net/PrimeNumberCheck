/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youssef.primenumber;

/**
 *
 * @author Youssef
 * In questo esercizio proposto da leetcode.com 
 * Bisogna trovare la frequenza(f appartenete ad N) di ciascun numero(x appartente ad N) presente in un array
 * E controllare se (f) di (x) è un numero primo
 * Se si trova un (f) come numero primo  bisogna interrompere l'esecuzione restituendo true
 * Se invece nessuna (f) è un numero primo bisogna restituire false;
 */
public class Engine {
    public boolean checkPrimeFrequency(int[] nums) 
    {
        //creo variabile frequenzy uguale a zero  
        int frequency = 0;
        //Ciclo per ogni numero presente nella lista
        for(int i = 0; i<nums.length; i++) {
            //Per ogni ciclo in posizione (i) faccio un altro ciclo in posizione (j)
            //Se il numero nella posizione i  è uguale a quello nella posizione j, aumento la frequenza di 1
            //la frequenza aumenterà di almeno un'unità, perché in i=j abbiamo il numero stesso 
            for(int j = 0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    frequency ++;
                }
            }
            //Ciclo per ciascun numero intero(n compreso tra 2 e la metà di frequenza aumentata di 1 (esteremi inclusi))
            //Controllo se il resto della divisone tra la frequenza e n, escludendo il caso f = n, sia uguale a zero (riga 36)
            //Se trovo un resto uguale a 0 signifca che la frequenza non è un numero primo 
            //Quindi interrompo il ciclo e ritorno al ciclo di partenza
            //Se invece arrivo allo estremo superiore in cui n è uguale a (f/2)+1  significa che f è un numero primo
            //Quindi interrompo tutto restituendo true
            for (int n = 2; n<=(frequency/2)+1; n++) {
                if(n == (frequency/2) +1){
                    return true;
                }                 
                if(frequency % n == 0 && frequency != n) {
                    break;
                }

            }
            frequency = 0;
        }
        return false;
    }
}
