/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

import java.util.Scanner;

/**
 *
 * @author Karen Amgad
 */
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){ 
        System.out.printf("Please Enter the Type of the Movie you prefer : A for Adventure , C for Comedy , S for Science Fiction or Q to Quit: ");
        String type = s.nextLine();
        if("Qq".contains(type)) {
           break;
             }
        System.out.println("Enter your Movie Title: ");
        String title = s.nextLine();
      Movie movie = Movie.getMovie(type, title);
      movie.watchMovie();
    }
    }
        
}
