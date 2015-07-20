package test;

import java.util.HashSet;

public class Solution {
	
    public static int solution(int N) {
    	int licznik=0,a=0;
    	int temp=N;
    	while (temp != 0) {
    		temp /= 10;
    		licznik++;
    		}

    	int tab[]=new int[licznik];	
    	while (N != 0) {
    		tab[a]=N%10;
    		N /= 10;
    		a++;
    		}
    	

    	HashSet set=new HashSet();
        for(int i=0;i<tab.length;i++)
          set.add(tab[i]);
       
        
		return set.size();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =solution(2330);
		System.out.println(a);
	}

}
