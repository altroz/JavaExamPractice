package com.OCP47;

public class FormattedTable {
	static void Line(){
		System.out.println("___________________________");
	}
	static void printHeader(){
		System.out.printf("% -15s\t%s\t%s\t%s\n", "Player", "Matches", "Goals", "Goals per Match");
	}
	static void printRow(String player, int matches, int goals){
		System.out.printf("%-15s\t%5d\t\t%d\t\t%.1f\n",player,matches,goals,((float)goals/(float)matches));
	}
	
	public static void main(String[]args){
		FormattedTable.printHeader();
		FormattedTable.Line();
		FormattedTable.printRow("Demando", 100, 122);
		FormattedTable.printRow("Munshi", 80, 200);
		FormattedTable.printRow("Peale", 150, 180);
		FormattedTable.Line();
	}
}
