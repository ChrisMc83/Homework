package MovieQuizGame;

import Udacity.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    File movieTitle=new File("MovieList");


    public static void welcome(){
        System.out.println("Welcome to the Movie Quiz Game\nYou will need to guess a letter and try and fill in all the blanks\nGood Luck!");

    }
    public static void setMovieTitle() throws FileNotFoundException {

        File movieTitle = new File("MovieList");

        System.out.println (movieTitle);



        }

    }



