import ecs100.*;
import java.util.*;

public class Names {
	private ArrayList<String> allNames = new ArrayList<String>();

	public Names() {
		UI.initialise();
		UI.addButton("New", this::newList);
		UI.addButton("Add", this::addName);
		UI.addButton("List", this::displayList);
		UI.addButton("Contains", this::doContains);
		UI.addButton("Remove", this::doRemove);
		UI.addButton("Quit", UI::quit);
	}

	public void addName() {
		String name = UI.askString("Name");
		allNames.add(name);
		displayList();
	}

	public void displayList() {
		UI.clearText();
		UI.printf("List has %d names:%n", allNames.size());
		for (int i = 0; i < allNames.size(); i++) {
			UI.printf("%3d: %s%n", i, allNames.get(i));
		}
		UI.println("-------------");
	}

	public void doContains() {
		String name = UI.askString("Name");
		if (allNames.contains(name)) {
			UI.println(name + "  is in the list");
		} else {
			UI.println(name + " is not in the list");
		}
	}

	public void doRemove() {
		String name = UI.askString("Name");
		if (allNames.remove(name)) {
			UI.println(name + " was removed");
		} else {
			UI.println(name + " was not present");
		}
	}

	public void newList() {
		allNames = new ArrayList<String>();
		// or: this.allNames.clear();
		displayList();
	}

	public static void main(String[] args) {
		new Names();
	}
}
