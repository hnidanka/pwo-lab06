/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Klasa narzędziowa służąca do obsługi obiektów<br>
 * implementujących interfejs {@link SequenceGenerator}
 *
 * @author sofiia
 * @version 1.0.0
 */
package pwo.utils;

 import java.io.FileWriter;
 import java.io.BufferedWriter;
 import java.io.IOException;

/**
 *
 * @author student
 */
public class SequenceTools {
 
 private static String getTerms(SequenceGenerator sg,
 int from, int to, String sep) {

 int i = from, stop = to, step = from > to ? -1 : 1;
 String terms = "";

 while(true){
 terms += sg.getTerm(i) + sep;
 if(i==stop) return terms.trim();
 i+=step;
 }
 }
/**
 *
 * @param sg
 * @param from
 * @param to
 * @return
 */
 public static String getTermsAsColumn(SequenceGenerator sg,
 int from, int to) {
 return getTerms(sg, from, to, "\n");
 }
/**
 *
 * @param sg
 * @param from
 * @param to
 * @return
 */
 public static String getTermsAsLine(SequenceGenerator sg,
 int from, int to) {
 return getTerms(sg, from, to, " ");
 }
 /**
 *
 *
 * @param sg
 * @param from
 * @param to
 * @param fileName
 * @return
 */
 public static boolean writeToFile(SequenceGenerator sg,
 int from, int to, String fileName) {

 try ( BufferedWriter writer = new BufferedWriter(
 new FileWriter(fileName))) {
 writer.write(getTermsAsColumn(sg, from, to));
 } catch (IOException ex) { return false; }

 return true;
 }
 }