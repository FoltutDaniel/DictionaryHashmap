package com.zeke.Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dictionary dictionary = new Dictionary();
        boolean on = true;
        while(on) {
        	int option;
        	System.out.println("Introduceti: 1-Adaugarea unui cuvant in dictionar 2-Cautarea unui cuvant in dictionar 3-Afisarea tuturor cuvintelor din dictionar 4-Inchidere");
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	try {
				option = Integer.parseInt(br.readLine());
				switch (option) {
				case 1:
						String wordName;
						String defName;
						System.out.println("Introduceti cuvantul: ");
						wordName = br.readLine();
						Word toIntroduce = new Word(wordName);
						System.out.println("Introduceti definitia cuvantului: ");
						defName = br.readLine();
						Definition definition = new Definition(defName);
						dictionary.addWord(toIntroduce, definition);
					break;
				
				case 2:
						String wordSearch;
						System.out.println("Introduceti cuvantul: ");
						wordSearch = br.readLine();
						if(dictionary.getDefinition(new Word(wordSearch)) != null) {
							System.out.println(dictionary.getDefinition(new Word(wordSearch)).getDefinition());
						}else {
							System.err.println("Nu exista cuvantul in dictionar");
						}
						break;
				case 3:
						for( Word key : dictionary.getAllWords()) {
							System.out.println(key.getName());
						}
					break;
				case 4:
					System.out.println("La revedere!");
					on = false;
					break;
				default:
					break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Not a number");
			} catch (IOException e) {
				System.err.println("IOException");
			}
        }
    }
}
