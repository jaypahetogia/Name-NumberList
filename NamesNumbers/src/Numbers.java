import java.util.ArrayList;

import ecs100.UI;

public class Numbers {
		private ArrayList<Integer> allNumbers = new ArrayList<Integer>();
		
		public Numbers() {
			UI.initialise();
			UI.addButton("Add", this::addNumber);
			UI.addButton("Display List", this::displayList);
			UI.addButton("Delet List", this::deleteList);
			UI.addButton("Average", this::averageNumber);
			UI.addButton("Double it", this::dblnumber);
			UI.addButton("Negative", this::negativeNumber);
		}
			
		public void dblnumber() {
			UI.clearText();
			for (int i = 0; i < this.allNumbers.size(); i++) {
			allNumbers.set(i, 2*(this.allNumbers.get(i)));
			UI.printf("%3d: %s%n", i, (this.allNumbers.get(i)));
			}
			}
	
		public void negativeNumber() {
			UI.clearText();
			for (int i = 0; i < this.allNumbers.size(); i++) {
				allNumbers.set(i, -1*(this.allNumbers.get(i)));
				UI.printf("%3d: %s%n", i, (this.allNumbers.get(i)));
			}
		}
		
		
		public void addNumber() {
			int number = UI.askInt("Add a number");
			while(number>=0) {
			allNumbers.add(number);
			number = UI.askInt("Add a number");
			}
		}
		
		public void displayList() {
			UI.clearText();
			UI.printf("The List has %d values %n", allNumbers.size());
			
			for (int i = 0; i < this.allNumbers.size(); i++) {
				UI.printf("%3d: %s%n", i, this.allNumbers.get(i));
			}
		}
		
		public void deleteList() {
			UI.clearGraphics();
				allNumbers.clear();
			}
		public void averageNumber() {
			double sum = 0;
			for(int i=0; i<this.allNumbers.size(); i++) {
				sum = sum + this.allNumbers.get(i);
			}
			double average = sum/this.allNumbers.size();
			UI.println("");
			UI.println("The average is " + average);
		}
		
	
			
	public static void main(String[] args) {
		new Numbers();
	}
}
