/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Morari
 * Created: Aug 20, 2018
 */

public class Diamond {
	
	public static void main (String args[]) {
		
		for (int x=5; x>1; x--) {
			for (int y=1; y<x;y++) {
				System.out.print(' ');
			}
				System.out.print('*');
				for (int z=0; z<5; z++) {
					for(int i=0;i<z;i++){
						System.out.print('*');
					}
					System.out.println();
 
			
		}
	}
}